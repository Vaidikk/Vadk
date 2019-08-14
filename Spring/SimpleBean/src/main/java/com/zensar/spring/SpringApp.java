package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Author: Vaidik Khandelwal
 * Creation Date: 27th Jul 2019 1.15PM IST
 * Modified Date: 27th Jul 2019 1.15PM IST
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: It is SpringApp.java  Class
 * 
 * */


public class SpringApp 
{
    public static void main( String[] args )
    {
    	//Spring IoC Container Object
        ApplicationContext ctx= new ClassPathXmlApplicationContext("greetings.xml");
        
        //Obtaining ready-made object from SpringIoC Container
        Greeting g1 = ctx.getBean("birthday", Greeting.class);
        //Invoking Business Logic method
        System.out.println(g1.sayGreet());
        
        Greeting g2 = ctx.getBean("Holi", Greeting.class);
        System.out.println(g2.sayGreet());
        
        Greeting g3 = ctx.getBean("birthday", Greeting.class);
     }
}
