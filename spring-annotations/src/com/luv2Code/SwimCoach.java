package com.luv2Code;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortune;
	
	public SwimCoach(FortuneService fortune) {
		this.fortune = fortune;
	}
	
	@Value("${foo.mail}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	
	@Override
	public String getDailyWorkOut() {
		
		return "Swim hard and Win!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
