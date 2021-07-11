package com.webapp.student.service;

import java.util.List;

import com.webapp.student.entity.Job;

public interface JobService {
	public List<Job> getjobs();

	public void saveJobs(Job theJob);

}
