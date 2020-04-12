package com.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortune;

	public BaseballCoach(FortuneService fortune) {
		super();
		this.fortune = fortune;
	}
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "spend 30 minutes on batting pracice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}
	
	

}
