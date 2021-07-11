package com.webapp.student.dao;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.webapp.student.entity.Sale;

@Repository
public class SaleDAOImpl implements SaleDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Sale> getSales() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Sale> thequery = currentSession.createQuery("from Sale", Sale.class);

		List<Sale> sales = thequery.getResultList();

		return sales;
	}

	@Override
	public void saveItems(@Valid Sale theItem) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(theItem);		
	}

}
