package com.spring.model;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Shop {

	
	@Value("FurnTurn Bang")
	private String shopName;
	@Value("Bangalore")
	private String shopLocation;
	@Value("#{${discountDetails: {Teak: '3', Sheesham: '5', RubberWood: '2', Wenge: '8', Pine: '4'}}}")
	private Map<String,Integer> discountDetails;

	public String getShopName() {
		return shopName;
	}
	
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopLocation() {
		return shopLocation;
	}
	
	public void setShopLocation(String shopLocation) {
		this.shopLocation = shopLocation;
	}
	public Map<String, Integer> getDiscountDetails() {
		return discountDetails;
	}
	
	public void setDiscountDetails(Map<String, Integer> discountDetails) {
		this.discountDetails = discountDetails;
	}	
	
}
