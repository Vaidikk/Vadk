package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.business.ProductService;

/**
 * Hello world!
 *
 */
public class DbOperations 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("dbconfig.xml");
        
        ProductService service = context.getBean("productServiceImpl", ProductService.class);
        
        Product product = new Product(1008, "Fridge", "Godrej", 52000f);
//        service.create(product);//Working
//        service.remove(product);//Working
//        service.edit(product);//Working
        
        System.out.println(service.findProductById(1003));
        System.out.println("\n");
        
        for(Product p: service.findAllProducts())
        	System.out.println(p);
//        System.out.println(service.findAllProducts());
    }
}
 