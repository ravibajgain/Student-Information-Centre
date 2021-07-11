package com.webapp.student.service;

import java.util.List;

import com.webapp.student.entity.Lease;

public interface LeaseService {
	public List<Lease> getLeases();

	public void saveLeases(Lease theLease);

	


}
