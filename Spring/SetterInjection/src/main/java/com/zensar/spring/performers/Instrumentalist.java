package com.zensar.spring.performers;

import com.zensar.spring.instruments.Instrument;

/*
 * Author: Vaidik Khandelwal
 * Creation Date: 27th Jul 2019 17.32PM IST
 * Modified Date: 27th Jul 2019 17.32PM IST
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Its a guitar player.
 * 
 * */
public class Instrumentalist implements Performer {

	private String song;
	private Instrument instrument;
	
	
	//for setter injection
	public void setSong(String song) {
		this.song = song;
		System.out.println("Song is set...");
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("Instrument is set...");
	}
	
	//business logic
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist is playing song.");
		instrument.play();
	}

}
