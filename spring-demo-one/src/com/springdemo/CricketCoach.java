package com.springdemo;

public class CricketCoach implements Coach  {

	private FortuneService fortuneService;
	
	//A no-arg constructor is needed for a setter injection
	
	public CricketCoach () {
		System.out.println("Inside the no-arg contructor");
	}
	
	public void setFortuneService(FortuneService fortune) {
		System.out.println("Inside the setter injection");
		fortuneService = fortune;
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
