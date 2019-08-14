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
        
        Product product = new Product(1003, "TV", "Dell", 42000f);
        ProductService service = context.getBean("productServiceImpl", ProductService.class);
//        service.create(product);//Working
//        service.remove(product);//Working
//        service.edit(product);//Working
        System.out.println(service.findProductById(1003));
        System.out.println("\n");
        System.out.println(service.findAllProducts());
    }
}
