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
@RequestMapping("/patient")
public class PatientController {

	@RequestMapping("/patientForm")
	public String patientForm(Model model) {
		model.addAttribute("patient", new Patient());
		return "patientForm";
	}
	
	// deal with white spaces
	
	@InitBinder
	public void InitBinder (WebDataBinder binder) {
		
		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		
		binder.registerCustomEditor(String.class, trimmerEditor);
			
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("patient") Patient patient, 
			BindingResult result) 
	{		
		
	if(	result.hasErrors())
		return "patientForm";
		
	else
		return "patient-processForm";
		
	}
}
