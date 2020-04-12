package com.luv2Code;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	public String fortuneArray []  = {
			"Beware of evil people", 
			"Do not be evil",
			"Be kind to all"};
	
	public Random rand = new Random();

	@Override
	public String getFortune() {
		
		int index = rand.nextInt(fortuneArray.length);
		
		String fortune = fortuneArray[index];
		
		return fortune ;
	}

}
