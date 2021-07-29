package com.webapp.student.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.student.dao.RentDAO;
import com.webapp.student.entity.Rent;

@Service
public class RentServiceImpl implements RentService {

	@Autowired
	private RentDAO rentDAO;

	@Override
	@Transactional
	public List<Rent> getRents() {
		return rentDAO.getRents();
	}

	@Override
	@Transactional
	public void saveRents(Rent theRent) {
		rentDAO.saveRents(theRent);
		
	}

	@Override
	@Transactional
	public List<Rent> myRents() {
		return rentDAO.myRents();
	}

	
}
