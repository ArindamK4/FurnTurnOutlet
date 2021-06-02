package com.spring.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.spring.bo.ProductBO;
import com.spring.config.ApplicationConfig;
import com.spring.exception.InvalidProductIdException;
import com.spring.model.Product;

@Component
public class ProductService {
	
	private ProductBO productBOObj;

	@Autowired
	public ProductService(ProductBO productBOObj) {
		super();
		this.productBOObj = productBOObj;
	}

	public ProductBO getProductBOObj() {
		return productBOObj;
	}

	public void setProductBOObj(ProductBO productBOObj) {
		this.productBOObj = productBOObj;
	}

	public double calculateBill(String productId,String productName,double mrpValue,String dimension, String woodType) throws InvalidProductIdException {

		double amount=0;
		if(productId.matches("[0-9]+")) {
			ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
			Product productObj = (Product) ctx.getBean(Product.class);
			productObj.setProductId(productId);
			productObj.setProductName(productName);
			productObj.setMrpValue(mrpValue);
			productObj.setDimension(dimension);
			
			amount = productBOObj.calculateBill(productObj, woodType);			
		}
		else {
			throw new InvalidProductIdException("Invalid Product ID");
		}
		return amount;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
