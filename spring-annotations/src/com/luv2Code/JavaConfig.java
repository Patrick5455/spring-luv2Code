package com.luv2Code;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.luv2Code")
@PropertySource("classpath:sport.properties")
public class JavaConfig {
	
	@Bean
	public FortuneService fortune () {
		
		return new SadFortuneService();
	}
	
	@Bean
	public SwimCoach swim () {
		
		return new SwimCoach(fortune());
	}

}
