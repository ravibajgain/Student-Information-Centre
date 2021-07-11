package com.webapp.student.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webapp.student.entity.Job;

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
		
		//saving using hibernate 
		
		currentSession.save(theJob);
		
	}

}
