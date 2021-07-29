package com.webapp.student.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webapp.student.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<User> getUsers() {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create Query
		Query<User> theQuery = currentSession.createQuery("from User", User.class);
		int id= 1;
		User tempUser = currentSession.get(User.class, id);
		System.out.println("list of jobs belonging to this user "+tempUser.getJobLists());
		
		// execute query and get results
		List<User> users = theQuery.getResultList();
		

		// return the results
		return users;
	}

}
