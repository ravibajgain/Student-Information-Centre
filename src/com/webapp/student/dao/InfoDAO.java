package com.webapp.student.dao;

import java.util.List;

import com.webapp.student.entity.Info;

public interface InfoDAO {

	public List<Info> getInfos();

	public void saveInfos(Info theInfo);

}
