package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class GreetingApp 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("greetings.xml");
        
//        Greeting g = context.getBean("festivalGreeting", FestivalGreeting.class);
        
        Greeting g = context.getBean("festivalBean", Greeting.class);
        System.out.println(g.sayGreet());
        
    }
}
