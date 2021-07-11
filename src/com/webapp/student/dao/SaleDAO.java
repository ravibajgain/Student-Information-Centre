package com.webapp.student.dao;

import java.util.List;

import javax.validation.Valid;

import com.webapp.student.entity.Sale;

public interface SaleDAO {
	public List<Sale> getSales();

	public void saveItems(@Valid Sale theItem);

}
