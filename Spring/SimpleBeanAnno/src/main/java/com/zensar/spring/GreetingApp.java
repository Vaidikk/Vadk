package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zensar.spring.config.GreetingConfig;

public class GreetingApp 
{

    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(GreetingConfig.class);
        Greeting greeting = context.getBean("aniversaryGreeting", Greeting.class);
        
        System.out.println(greeting.sayGreet());
    }
}
