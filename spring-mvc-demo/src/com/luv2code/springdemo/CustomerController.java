package com.luv2code.springdemo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {	
		model.addAttribute("customer",new Customer());
		
		return "customer-form";
	}
	
	// We need to cater for white spaces in our error check field hence the need for the @InitBinder method below
	
	@InitBinder
	public void InitBinder (WebDataBinder binder) {
		
		StringTrimmerEditor trim = new StringTrimmerEditor(true);
		
		binder.registerCustomEditor(String.class, trim);
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer,BindingResult bindingResult) 
	{
	
		// the use of | is a trick to check for white spaces
		System.out.println("White Space: |"+ customer.getFirstName()+customer.getLastName()+"|");
		
		
		if(bindingResult.hasErrors()) {
			return "customer-form";
			//return "customer-form-response";
		}
		
		else {
		return "customer-form-response";}
	}
	
}
