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

import com.webapp.student.entity.Sale;
import com.webapp.student.service.SaleService;

@Controller
@RequestMapping("/secondhand")
public class SaleController {

	@Autowired
	private SaleService saleService;

	@GetMapping("/itemaddForm")
	public String addItem(Model theModel) {
		Sale theSale = new Sale();
		theModel.addAttribute("items", theSale);
		return "add-item";
	}

	@GetMapping("/list")
	public String displayitems(Model theModel) {

		List<Sale> theSale = saleService.getSales();
		theModel.addAttribute("items", theSale);
		return "item-list";
	}
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor );
	}
	
	@PostMapping("/saveItems")
	public String saveItems(@Valid @ModelAttribute("items") Sale theItem, BindingResult theBindingResult) {
		if(theBindingResult.hasErrors()) {
			return "add-item";
		}else {
			saleService.saveItems(theItem);
			return "redirect:/secondhand/list";
		}
	}
	@GetMapping("/myitemList")
	public String myItemList(Model theModel) {
		List<Sale> mySale = saleService.getMyitems();
		theModel.addAttribute("items", mySale);
		return"my-items";
	}
		
}
