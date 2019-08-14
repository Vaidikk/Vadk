package com.zensar.spring;


/*
 * Author: Vaidik Khandelwal
 * Creation Date: 27th Jul 2019 12.53PM IST
 * Modified Date: 27th Jul 2019 12.53PM IST
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: It is specialized greeting used to greet Holi to anyone and everyone..
 * 
 * */

public class HoliGreeting implements Greeting {

	public HoliGreeting() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Holi Greeting generated!!");
	}
	
	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Do me a favour let's play HOLI!";
	}

}
