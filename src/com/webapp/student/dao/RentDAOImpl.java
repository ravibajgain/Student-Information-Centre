package com.webapp.student.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.webapp.student.entity.Rent;
import com.webapp.student.entity.User;

@Repository
public class RentDAOImpl implements RentDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Rent> getRents() {

		Session currentSession = sessionFactory.getCurrentSession();

		Query<Rent> theQuery = currentSession.createQuery("from Rent", Rent.class);

		List<Rent> rents = theQuery.getResultList();

		return rents;
	}

	@Override
	public void saveRents(Rent theRent) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(theRent);

	}

	@Override
	public List<Rent> myRents() {
		Session currentSession = sessionFactory.getCurrentSession();
		int nextId = 1;
		User nextUser = currentSession.get(User.class, nextId);
		List<Rent> rents = nextUser.getRentLists();

		return rents;
	}

}
