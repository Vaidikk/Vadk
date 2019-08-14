package com.zensar.spring.poems;
/*
 * Author: Vaidik Khandelwal
 * Creation Date: 27th Jul 2019 16.20PM IST
 * Modified Date: 27th Jul 2019 16.20PM IST
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Its a Haiku, but we gonna use it as Poem.
 * 
 * */
public class Haiku implements Poem {
	
	private final static String LINES[] = {
		"In the twilight rain",
		"these brilliant-hued hibiscus",
		"A lovely sunset."
	};
	
	public void recite() {
		// TODO Auto-generated method stub
		for(String line: LINES)
			System.out.println(line);

	}

}
