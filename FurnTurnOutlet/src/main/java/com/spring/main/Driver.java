package com.spring.main;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.spring.config.ApplicationConfig;
import com.spring.exception.InvalidProductIdException;
import com.spring.service.ProductService;

@Component
public class Driver {

	public static void main(String[] args) throws InvalidProductIdException{

		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		ProductService productService = ctx.getBean(ProductService.class);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the product id:");
		String productId = sc.nextLine();
		
		System.out.println("Enter the product name:");
		String productName = sc.nextLine();
		
		System.out.println("Enter the mrp value:");
		double mrpValue = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the dimension details:");
		String dimension = sc.nextLine();
		
		System.out.println("Enter the wood type:");
		String woodType = sc.nextLine();
		

		double amount = productService.calculateBill(productId, productName, mrpValue, dimension, woodType);
		System.out.println("Amount to be paid is:"+amount);
	}

}
