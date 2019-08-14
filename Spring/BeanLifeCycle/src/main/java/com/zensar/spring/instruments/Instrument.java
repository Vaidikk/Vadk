package com.zensar.spring.instruments;
/*
 * Author: Vaidik Khandelwal
 * Creation Date: 27th Jul 2019 17.32PM IST
 * Modified Date: 29th Jul 2019 14.32PM IST
 * Version: 2.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: It is used to represent instrument.
 * Part of bean life cycle.
 * 
 * */
public interface Instrument {
	void tune();
	void play();
	void clean();
}
