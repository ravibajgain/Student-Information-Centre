package com.webapp.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.student.dao.InfoDAO;
import com.webapp.student.entity.Info;

@Service
public class InfoServiceImpl implements InfoService {

	@Autowired
	private InfoDAO infoDAO;

	@Override
	@Transactional
	public List<Info> getInfos() {
		return infoDAO.getInfos();
	}

	@Override
	@Transactional
	public void saveInfos(Info theInfo) {
		infoDAO.saveInfos(theInfo);

	}

}
