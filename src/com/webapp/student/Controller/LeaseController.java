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

import com.webapp.student.entity.Lease;
//import com.webapp.student.entity.User;
import com.webapp.student.service.LeaseService;

@Controller
@RequestMapping("/lease")
public class LeaseController {

	@Autowired
	private LeaseService leaseService;

	/*
	 * @Autowired private User theuser;
	 */

	@GetMapping("/list")
	public String displayLease(Model theModel) {

		List<Lease> theLease = leaseService.getLeases();

		theModel.addAttribute("leases", theLease);

		return "lease-list";
	}

	@GetMapping("/leaseaddForm")
	public String addLease(Model theModel) {
		Lease nextLease = new Lease();
		theModel.addAttribute("leases", nextLease);
		return "add-lease";
	}
	// Init binder ... to convert trim input strings

	// remove leading and trailing whitespace

	// resolve issue for validation..
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@PostMapping("/saveLeases")
	public String saveLeases(@Valid @ModelAttribute("leases") Lease theLease, BindingResult theBindingResult) {
		// save the leases using service

		if (theBindingResult.hasErrors()) {
			return "add-lease";
		} else {

			// theLease.setUserID(theuser);
			leaseService.saveLeases(theLease);

			return "redirect:/lease/list";

		}

	}

}
