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

import com.webapp.student.entity.Job;
import com.webapp.student.service.JobService;

@Controller
@RequestMapping("/job")
public class JobController {

	@Autowired
	private JobService jobService;

	@GetMapping("/list")
	public String displayJobs(Model theModel) {

		// get jobs from database i.e service
		List<Job> thejobs = jobService.getjobs();

		// adding jobs to the model  
		theModel.addAttribute("jobs", thejobs);

		return "job-list";
	}

	@GetMapping("/jobaddform")
	public String jobAddForm(Model theModel) {
		Job nextJob = new Job();
		theModel.addAttribute("jobs", nextJob);
		return "add-jobs";

	}
	//Init binder ... to convert trim input strings
	
		//remove leading and trailing whitespace
		
		//resolve issue for validation..
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor );
	}
		

	@PostMapping("/saveJobs")
	public String saveJobs(@Valid @ModelAttribute("jobs") Job theJob, BindingResult theBindingResult) {
		// save the jobs using service

		if (theBindingResult.hasErrors()) {
			return "add-jobs";
		} else {

			jobService.saveJobs(theJob);

			return "redirect:/job/list";

		}

	}

	/**
	 * @GetMapping("/add") public String addJobs() { return "add-jobs"; }
	 */

}
