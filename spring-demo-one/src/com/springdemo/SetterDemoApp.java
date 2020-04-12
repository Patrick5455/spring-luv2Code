package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach coach = ctx.getBean("cricketCoach", CricketCoach.class);
	}

}
