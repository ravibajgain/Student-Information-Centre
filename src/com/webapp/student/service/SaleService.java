package com.webapp.student.service;

import java.util.List;

import javax.validation.Valid;

import com.webapp.student.entity.Sale;

public interface SaleService {
	public List<Sale> getSales();

	public void saveItems(@Valid Sale theItem);

}
