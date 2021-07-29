package com.webapp.student.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webapp.student.entity.Lease;
//import com.webapp.student.entity.User;
import com.webapp.student.entity.User;

@Repository
public class LeaseDAOImpl implements LeaseDAO {

	@Autowired
	private SessionFactory sessionFactory;
		
	@Override

	public List<Lease> getleases() {

		Session currentSession = sessionFactory.getCurrentSession();
		// SessionFactory factory = new Configuration().addAnnotatedClass(User.class)

		Query<Lease> theQuery = currentSession.createQuery("from Lease", Lease.class);

		List<Lease> leases = theQuery.getResultList();

		return leases;
	}

	@Override
	public void getLeases(Lease theLease) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		//SessionFactory fac = (SessionFactory) new Configuration().addAnnotatedClass(User.class);
		//theLease.setUserID(theUser);
		currentSession.save(theLease);

	}

	@Override
	public Lease getMyLeases() {
		Session currentSession = sessionFactory.getCurrentSession();
		int theId = 1;
		User tempUser = currentSession.get(User.class, theId);
		Lease leases = tempUser.getLease();


		
		return leases;
	}

}
