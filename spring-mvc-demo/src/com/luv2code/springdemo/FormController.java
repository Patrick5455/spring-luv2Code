package com.luv2code.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		
		return "form-page";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		
		return "form-response";
	}

}
