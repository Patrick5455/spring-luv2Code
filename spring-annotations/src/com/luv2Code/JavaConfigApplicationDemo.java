package com.luv2Code;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApplicationDemo {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Coach swimCoach = ctx.getBean("swim", Coach.class);
		
		SwimCoach swimCoach2 = ctx.getBean("swim", SwimCoach.class);

		
		System.out.println(swimCoach.getDailyFortune());
		System.out.println(swimCoach.getDailyWorkOut()); 
		
		System.out.println("Reading Values from Properties file: ");
		
		System.out.println("Email: " + swimCoach2.getEmail());
		
		System.out.println("Team: " + swimCoach2.getTeam());


	}

}
