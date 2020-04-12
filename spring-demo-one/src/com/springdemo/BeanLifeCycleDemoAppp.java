package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoAppp {

	public static void main(String[] args) {

		//load the config file
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-lifecycle-applicationContext.xml");
		
		//get bean from the config file
		Coach coach = ctx.getBean("coach", Coach.class);
		
		System.out.println(coach.getDailyWorkOut());
		
		System.out.println(coach.getDailyFortune());
		
		// the destroy method is called upon closing of the context - destruction of the bean. If the context is not closed as in below, the destroy method will not be called.
	
		ctx.close();
	}

}
