package com.luv2Code;

import org.springframework.stereotype.Component;

//@Component("trackID")
@Component() //use default bean ID-- className in lowerCase
public class TrackCoach implements Coach {
		
	@Override
	public String getDailyWorkOut() {
		
		return "Get a backhand practice";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
