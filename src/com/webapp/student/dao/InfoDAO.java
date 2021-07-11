package com.webapp.student.dao;

import java.util.List;

import javax.validation.Valid;

import com.webapp.student.entity.Info;

public interface InfoDAO {
	
	public List<Info> getInfos();

	public void saveInfos(@Valid Info theInfo);

}
