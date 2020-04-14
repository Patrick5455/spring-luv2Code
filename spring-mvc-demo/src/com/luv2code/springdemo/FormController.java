package com.luv2code.springdemo;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		
		return "form-page";
	}
	
//	@RequestMapping("/processForm")
//	public String processForm() {
//		
//		return "form-response";
//	}
	
	@RequestMapping("/processForm")
	public String processForm2(HttpServletRequest request, Model model) {
		
		//.getParameter collects the name of the html form  field that contains the data naem
		String name = request.getParameter("studentName");
		
		// convert to upperCase
		name = "Welcome " + name.toUpperCase();
		
		// add result to model
		model.addAttribute("message",name);
		
		return "form-response";
	}

}
