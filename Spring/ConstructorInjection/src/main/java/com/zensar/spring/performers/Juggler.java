package com.zensar.spring.performers;
/*
 * Author: Vaidik Khandelwal
 * Creation Date: 27th Jul 2019 16.20PM IST
 * Modified Date: 27th Jul 2019 12.20PM IST
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Its for them jugglers, gonna implement Performer.
 * Juggler gets bean bags using constructor injection.
 * 
 * */
public class Juggler implements Performer {

	private int beanBags;
	
	public Juggler() {
		// TODO Auto-generated constructor stub
		System.out.println("No arg constructor of Juggler");
	}
	
	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
		System.out.println("Param constructor of Juggler");
	}

	//business logic method of Performer

	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Juggler juggling: "+beanBags);
	}

}
