package com.webapp.student.dao;

import java.util.List;

import com.webapp.student.entity.Rent;

public interface RentDAO {
	public List<Rent> getRents();
	public void saveRents(Rent theRent);
	public List<Rent> myRents();



	
}
