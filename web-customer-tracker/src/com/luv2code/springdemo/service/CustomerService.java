package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerService {
	
	List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer update(int theId);

	void delete(int id);

	void delete2(int id);

}
