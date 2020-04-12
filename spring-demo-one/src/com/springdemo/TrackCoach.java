package com.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortune;
	
	public TrackCoach(FortuneService fortune) {
		super();
		this.fortune = fortune;
	}

	public TrackCoach() {}

	
	public void initMethod() {
		
		System.out.println("Started with initialisation method");
	}
	
	public void destroyMethod() {
		System.out.println("Ended with destroy method");
	}
	
	
	@Override
	public String getDailyWorkOut() {
		return "Run a hard 5k";
	}
	
	@Override
	public String getDailyFortune() {
		return "Just Do it:" + fortune.getFortune();
	}

}
