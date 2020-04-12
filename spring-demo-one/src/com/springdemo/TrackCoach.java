package com.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortune;
	
	public TrackCoach(FortuneService fortune) {
		super();
		this.fortune = fortune;
	}

	public TrackCoach() {}

	@Override
	public String getDailyWorkOut() {
		return "Run a hard 5k";
	}
	
	@Override
	public String getDailyFortune() {
		return "Just Do it:" + fortune.getFortune();
	}

}
