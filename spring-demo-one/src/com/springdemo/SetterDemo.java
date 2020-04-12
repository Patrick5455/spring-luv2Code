package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach coach = ctx.getBean("cricketCoach", CricketCoach.class);
		
		System.out.println(coach.getEmail());
		System.out.println(coach.getTeam());
		
		ctx.close();
	}

}
