package com.webapp.student.dao;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.student.entity.Info;
@Repository
public class InfoDAOImpl implements InfoDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Info> getInfos() {
		Session currentsession = sessionFactory.getCurrentSession();
		
		Query<Info> theQuery = currentsession.createQuery("from Info",Info.class);
		List<Info> services = theQuery.getResultList();
		
		return services;
	}

	@Override
	public void saveInfos(@Valid Info theInfo) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(theInfo);
		
	}

}
