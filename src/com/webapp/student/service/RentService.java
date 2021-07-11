package com.webapp.student.service;

import java.util.List;

import com.webapp.student.entity.Rent;

public interface RentService {

	public List<Rent> getRents();

	public void saveRents(Rent theRent);

}
