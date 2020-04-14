package com.luv2code.springdemo;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	
	private LinkedHashMap<String, String> countryList;
	
	public Student() {
		
		countryList = new LinkedHashMap<>();
		
		countryList.put("BR", "Brazil");
		countryList.put("DE", "Germany");
		countryList.put("ES", "Spain");
		countryList.put("FR", "France");
		countryList.put("US", "United States of America");	
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
	}

}
