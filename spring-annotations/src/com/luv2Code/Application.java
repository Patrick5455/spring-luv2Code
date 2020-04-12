package com.luv2Code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = ctx.getBean("trackID", Coach.class);
		
		System.out.println(coach.getDailyWorkOut());
		
		
	}

}
