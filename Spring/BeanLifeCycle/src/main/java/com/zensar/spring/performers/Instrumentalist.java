package com.zensar.spring.performers;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.zensar.spring.instruments.Instrument;

/*
 * Author: Vaidik Khandelwal
 * Creation Date: 27th Jul 2019 17.32PM IST
 * Modified Date: 29th Jul 2019 14.32PM IST
 * Version: 2.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Its a guitar player.
 * 
 * */
public class Instrumentalist implements Performer,
BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

	private String song;
	private Instrument instrument;
	private String beanName;
	
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
		System.out.println("Instrumentalist " + beanName +" is playing song.");
		instrument.play();
	}
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.beanName = name;
		System.out.println("Bean name is set...");
	}
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("inside BeanFactory");
	}
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Application context is set");
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
//		instrument.tune();
		System.out.println("afterPropertiesSet method is called..");
	}
	
	public void tuneInstrument() {
		instrument.tune();
		System.out.println("custom init method");
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
//		instrument.clean();
		System.out.println("destroy method is called");
	}
	
	public void cleanInstrument() {
		instrument.clean();
		System.out.println("custom cleanInstrument method");
	}
	
}
