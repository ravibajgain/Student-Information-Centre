package com.webapp.student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.student.dao.UserDAO;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserDAO userDAO;

	@GetMapping("/signup")
	public String createAccount(Model theModel) {

		return "signup";
	}

	@GetMapping("/login")
	public String login(Model theModel) {
		return "login";
	}

}
