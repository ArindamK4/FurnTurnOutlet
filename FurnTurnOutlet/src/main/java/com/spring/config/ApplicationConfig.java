package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.bo.ProductBO;
import com.spring.model.Product;
import com.spring.model.Shop;
import com.spring.service.ProductService;

// fill the code
@Configuration
@ComponentScan
public class ApplicationConfig {

	@Bean
	public ProductBO productBO() {
		return new ProductBO();
	}
	
	@Bean
	public Product product() {
		return new Product(shop());
	}
	
	@Bean
	public Shop shop() {
		return new Shop();
	}
	
	@Bean
	public ProductService productService() {
		return new ProductService(productBO());
	}
	
}
