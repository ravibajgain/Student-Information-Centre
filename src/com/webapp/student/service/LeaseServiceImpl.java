package com.webapp.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.student.dao.LeaseDAO;
import com.webapp.student.entity.Lease;

@Service
public class LeaseServiceImpl implements LeaseService {
	@Autowired
	private LeaseDAO leaseDAO;

	@Override
	@Transactional
	public List<Lease> getLeases() {
		return leaseDAO.getleases();
	}

	@Override
	@Transactional
	public void saveLeases(Lease theLease) {
		leaseDAO.getLeases(theLease);
	
		
	}

}
