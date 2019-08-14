package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("festivalBean")
public class FestivalGreeting implements Greeting {

	public FestivalGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("FestivalGreeting created");
	}
	
	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Hanaka!!";
	}

}
