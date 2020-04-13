package com.luv2Code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext ("applicationContext.xml");
		
		Coach coach1 = ctx.getBean("tennisCoach", Coach.class); 
		
		Coach coach2 = ctx.getBean("tennisCoach", Coach.class); 
		
		boolean result = (coach1 == coach2);
		
		System.out.println("Are they same objects: " + result);
		
		System.out.println(">>Coach1 Address :" + coach1);
		System.out.println(">>Coach2 Address :" + coach2);

		

	}

}
