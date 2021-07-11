package com.webapp.student.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webapp.student.entity.Lease;

@Repository
public class LeaseDAOImpl implements LeaseDAO {

	@Autowired
	private SessionFactory  sessionFactory;
	@Override
	
	public List<Lease> getleases() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Lease> theQuery = currentSession.createQuery("from Lease",Lease.class);
		
		List<Lease> leases = theQuery.getResultList();
		
		
		return leases;
	}
	@Override
	public void getLeases(Lease theLease) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(theLease);
		
	}

}
