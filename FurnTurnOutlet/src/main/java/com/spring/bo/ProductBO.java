package com.spring.bo;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.spring.model.Product;

@Component
public class ProductBO {
	
	public double calculateBill(Product furObj,String woodType) {

		double amount=0;
		
		// fill the code
		Map<String,Integer> map = furObj.getShopDetails().getDiscountDetails();
		if(map.containsKey(woodType)) {
			int d=map.get(woodType);
			amount = furObj.getMrpValue()-(furObj.getMrpValue()*d)/100;
		}
		
		return amount;
	}

}
