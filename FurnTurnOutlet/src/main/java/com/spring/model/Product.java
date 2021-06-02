package com.spring.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Product {

	protected String productId;
	protected String productName; 
	protected double mrpValue;
	@Autowired
	protected Shop shopDetails;
	private String dimension;
	
	@Autowired
	public Product(Shop shopDetails) {
		super();
		this.shopDetails = shopDetails;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getMrpValue() {
		return mrpValue;
	}
	public void setMrpValue(double mrpValue) {
		this.mrpValue = mrpValue;
	}
	public Shop getShopDetails() {
		return shopDetails;
	}
	public void setShopDetails(Shop shopDetails) {
		this.shopDetails = shopDetails;
	}	
	
}

