package com.luv2Code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	
	private FortuneService fortune;

	//construtor injection with java annotation @Autowired
	@Autowired	
	public TennisCoach(FortuneService fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkOut() {
		return "Get a good tennis workout";
	}

	@Override
	public String getDailyFortune() {
		
		return fortune.getFortune();
	}

}
