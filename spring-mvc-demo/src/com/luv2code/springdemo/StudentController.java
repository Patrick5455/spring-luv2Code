package com.luv2code.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		Student theStudent =new Student();
		
		model.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) 
	{
		//log bound data
		System.out.println("Student FirstName:  " + theStudent.getFirstName());
		System.out.println("Student LastName:  " + theStudent.getLastName());

		return "student-form-response";
	}

}
