package com.younahShop.model;

import org.apache.ibatis.type.Alias;

@Alias("goods") 
public class Goods {	
	int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
