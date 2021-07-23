package com.webapp.student.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webapp.student.entity.Job;
import com.webapp.student.entity.User;

@Repository
public class JobDAOImpl implements JobDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Job> getjobs() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Job> theQuery = currentSession.createQuery("from Job order by date", Job.class);
		List<Job> jobs = theQuery.getResultList();

		return jobs;
	}

	@Override
	public void saveJobs(Job theJob) {
		// get the hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		int theId = 1;
		User tempUser = currentSession.get(User.class, theId);
		tempUser.addJobs(theJob);

		// saving using hibernate

		currentSession.save(theJob);

	}

	@Override
	public List<Job> getMyJobs() {
		Session currentSession = sessionFactory.getCurrentSession();
		int theId = 1;
		User tempUser = currentSession.get(User.class, theId);
		
		List<Job> jobs = tempUser.getJobLists();

		return jobs;
	}

}
