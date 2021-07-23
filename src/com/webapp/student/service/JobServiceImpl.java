package com.webapp.student.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.student.dao.JobDAO;
import com.webapp.student.entity.Job;

@Service
public class JobServiceImpl implements JobService {

	// injection of jobdao
	@Autowired
	private JobDAO jobDAO;
	
	@Override
	@Transactional
	public List<Job> getjobs() {
		return jobDAO.getjobs();
	}

	@Override
	@Transactional
	public void saveJobs(Job theJob) {
		jobDAO.saveJobs(theJob);
		
		
	}

	@Override
	@Transactional
	public List<Job> getMyJobs() {
		return jobDAO.getMyJobs();
	}

}
