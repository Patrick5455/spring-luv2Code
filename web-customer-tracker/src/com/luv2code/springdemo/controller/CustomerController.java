package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/list")
	public String listCustomers (Model model) {
		
		List<Customer> customers = customerService.getCustomers();
		
		model.addAttribute("customers", customers);
		
		return "list-customers";
	}
	
	@GetMapping("/showFormAdd")
	public String showFormAdd(Model model) {
		
		Customer theCustomer =  new Customer();
	
	model.addAttribute("customer", theCustomer);
	
	return "customer-form";
	}
	
	@PostMapping("/saveForm") 
	public String saveForm(@ModelAttribute("customer") Customer customer){
		
		customerService.saveCustomer(customer);
		
		return "redirect:/customer/list";
	}
	
	@GetMapping("/updateForm")
	public String updateForm(@RequestParam("customerId") int theId,
			Model model) 
	
	{ 
		
Customer customer = customerService.update(theId);
	 
	 model.addAttribute("customer",customer);
		
		return "customer-form";
	}
	
	@GetMapping("/deleteForm")
	public String deleteForm(@RequestParam("customerId") int id) {
		
		customerService.delete2(id);
		
		return "redirect:/customer/list";
		
	}
	
	
}
