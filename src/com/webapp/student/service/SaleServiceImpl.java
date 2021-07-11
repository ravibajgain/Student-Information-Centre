package com.webapp.student.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.student.dao.SaleDAO;
import com.webapp.student.entity.Sale;

@Service
public class SaleServiceImpl implements SaleService {
	@Autowired
	private SaleDAO saleDAO;

	@Override
	@Transactional
	public List<Sale> getSales() {
		return saleDAO.getSales();
	}

	@Override
	@Transactional
	public void saveItems(@Valid Sale theItem) {
		saleDAO.saveItems(theItem);
	}

}
