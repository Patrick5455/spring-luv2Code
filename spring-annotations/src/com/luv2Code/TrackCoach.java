package com.luv2Code;

import org.springframework.stereotype.Component;

@Component("trackID")
public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		
		return "Get a backhand practice";
	}

}
