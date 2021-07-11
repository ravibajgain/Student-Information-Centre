package com.webapp.student.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class homeController {
	@GetMapping("/index")
	public String displayMenu() {
		return "index";
	}
}
