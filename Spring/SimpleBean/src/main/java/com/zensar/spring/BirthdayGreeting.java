package com.zensar.spring;


/*
 * Author: Vaidik Khandelwal
 * Creation Date: 27th Jul 2019 12.51PM IST
 * Modified Date: 27th Jul 2019 12.51PM IST
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: It is specialized greeting used to greet someone having a Birthday..
 * 
 * */




public class BirthdayGreeting implements Greeting {

	public BirthdayGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("Birthday Greeting created!");
	}
	
	
	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Birthday!";
	}

}
