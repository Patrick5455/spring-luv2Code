package com.springdemo;

public class CricketCoach implements Coach  {

	private FortuneService fortuneService;
	private String email;
	private String team;
	
	//A no-arg constructor is needed for a setter injection
	
	public CricketCoach () {
		System.out.println("Inside the no-arg contructor");
	}
	
	public void setFortuneService(FortuneService fortune) {
		System.out.println("Inside the setter injection");
		fortuneService = fortune;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("SetEmail is secured");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("SetTeam is secured");
		this.team = team;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
