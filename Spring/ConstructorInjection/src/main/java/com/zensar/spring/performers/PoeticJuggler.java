package com.zensar.spring.performers;
/*
 * Author: Vaidik Khandelwal
 * Creation Date: 27th Jul 2019 16.20PM IST
 * Modified Date: 27th Jul 2019 16.20PM IST
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Poem is injected into PoeticJuggler
 * using Constructor Injection.
 * 
 * */

import com.zensar.spring.poems.Poem;

//Dependent object class
public class PoeticJuggler extends Juggler{
	
	//Dependency object reference
	private Poem poem;
	
	public PoeticJuggler() {
		// TODO Auto-generated constructor stub
		System.out.println("No arg const of PoeticJuggler");
	}

	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
	System.out.println("Parameterized const.");
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		super.perform();
		System.out.println("While reciting poem...");
		poem.recite();
	}
	
	
}
