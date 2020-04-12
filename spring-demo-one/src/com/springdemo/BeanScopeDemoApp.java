package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("bean-scope-applicationContext.xml");
		
		//singleton Vs prototype bean scope
		
		Coach coach = ctx.getBean("coach", Coach.class);
		
		Coach coach2 = ctx.getBean("coach", Coach.class);
		
		boolean sameScope = (coach == coach2);
		
		if(sameScope) {
			System.out.println("Singleton scope");
			System.out.println(" Similiar Address = " + coach + coach2);
		}
		
		else {
			System.out.println("Prototype scope");
			System.out.println(" Different Address = " + coach + coach2);

		}
		
		ctx.close();
	}

}
