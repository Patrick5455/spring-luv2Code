package com.luv2Code;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApplicationDemo {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
	}

}
