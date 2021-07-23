package com.webapp.student.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webapp.student.dao.UserDAO;
import com.webapp.student.entity.User;

@Repository
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;

	@Override
	@Transactional
	public List<User> getUsers() {

		return userDAO.getUsers();
	}

}
