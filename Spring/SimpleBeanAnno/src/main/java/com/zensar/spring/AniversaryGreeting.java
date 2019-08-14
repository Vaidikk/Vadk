package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component
public class AniversaryGreeting implements Greeting {

	public AniversaryGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("AniversaryGreeting created");
	}
	
	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Aniversary";
	}

}
