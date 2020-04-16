package com.luv2code.springdemo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Patient {
	
	@NotNull(message = "required")
	@Size(min = 1, message = "required")
	private String name;
	
	private String diseaseName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiseaseName() {
		return diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	
	
}
