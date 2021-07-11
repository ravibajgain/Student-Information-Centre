package com.webapp.student.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.student.entity.Rent;
import com.webapp.student.service.RentService;

@Controller
@RequestMapping("/rent")
public class RentController {
	@Autowired
	private RentService rentService;

	@GetMapping("/list")
	public String displayRents(Model theModel) {

		List<Rent> theRents = rentService.getRents();
		theModel.addAttribute("rents", theRents);

		return "rent-list";

	}

	@GetMapping("/rentaddForm")
	public String addRent(Model theModel) {
		Rent nextRent = new Rent();
		theModel.addAttribute("rents", nextRent);

		return "add-rent";
	}
	// Init binder ... to convert trim input strings

	// remove leading and trailing whitespace

	// resolve issue for validation..
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@PostMapping("/saveRents")
	public String saveRents(@Valid @ModelAttribute("rents") Rent theRent, BindingResult theBindingResult) {
		if(theBindingResult.hasErrors()) {
			return "add-rent";
		}
		else {
			rentService.saveRents(theRent);
			return "redirect:/rent/list";
			
		}
		

		}
	}

