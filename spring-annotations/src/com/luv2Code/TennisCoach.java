package com.luv2Code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	//field injection
	@Autowired
	@Qualifier("randomFortuneService")
	//NB: The @Qualifier name must be the default bean id of the class. i.e name of the class started with small letter 
	private FortuneService fortune;

	// the field injection works behind the scene because of a java technology called reflection
	
	//construtor injection with java annotation @Autowired
	
//	@Autowired	
//	public TennisCoach(FortuneService fortune) {
//		this.fortune = fortune;
//	}
	
	
	// setter injection
	
//	@Autowired
//	public void setFortune(FortuneService fortune) {
//		this.fortune = fortune;
//	}
	
	//NB: We did not declare a no-arg constructor. This is because there is no other constrcutor and the default no-arg constructor is operative

	@Override
	public String getDailyWorkOut() {
		return "Get a good tennis workout";
	}

	@Override
	public String getDailyFortune() {
		
		return fortune.getFortune();
	}

}
