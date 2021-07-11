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
import com.webapp.student.entity.Info;


import com.webapp.student.service.InfoService;

@Controller
@RequestMapping("/info")
public class InfoController {
	@Autowired
	private InfoService infoService;
	
	@GetMapping("/help")
	public String GetInfo (Model theModel) {
		List<Info> theInfos = infoService.getInfos();
		theModel.addAttribute("infos",theInfos);
		return "info-list";
	}
	
	@GetMapping("/infoaddForm")
	public String addInfos( Model theModel) {
		Info theInfo = new Info();
		theModel.addAttribute("infos", theInfo);
		return "add-info";
	}
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor );
	}
		
	@PostMapping("/saveInfos")
	public String saveInfos(@Valid @ModelAttribute("infos") Info theInfo, BindingResult theBindingResult) {
	
		if(theBindingResult.hasErrors()) {
			return "add-info";
		}else {
			infoService.saveInfos(theInfo);
			return "redirect:/info/help";

		}
	}
	

}