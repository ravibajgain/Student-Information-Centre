package com.webapp.student.dao;

import java.util.List;

import com.webapp.student.entity.Lease;

public interface LeaseDAO {
	public List<Lease> getleases();

	public void getLeases(Lease theLease);

}
