package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

/**
 * Hello world!
 *
 */
public class ZensarIdolApp 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("performers.xml");
        System.out.println();
        Performer performer = context.getBean("Sansa", Performer.class);
        performer.perform();
        
        System.out.println();
        performer = context.getBean("Arya", Performer.class);
        performer.perform();
        
        System.out.println();
        performer = context.getBean("Jon", Performer.class);
        performer.perform();
        
        System.out.println();
        performer = context.getBean("Danny", Performer.class);
        performer.perform();
        
        ConfigurableApplicationContext cfgctx = (ConfigurableApplicationContext) context;
        
        cfgctx.close();
    }
}
