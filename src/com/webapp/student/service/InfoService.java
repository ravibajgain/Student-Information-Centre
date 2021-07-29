package com.webapp.student.service;

import java.util.List;

import com.webapp.student.entity.Info;

public interface InfoService {
	public List<Info> getInfos();

	public void saveInfos(Info theInfo);
}
