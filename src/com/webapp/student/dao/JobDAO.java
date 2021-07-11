package com.webapp.student.dao;

import java.util.List;

import com.webapp.student.entity.Job;

public interface JobDAO {

	public List<Job> getjobs();

	public void saveJobs(Job theJob);
}
