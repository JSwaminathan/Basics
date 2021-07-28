
package com.jaa.billing;

import java.util.*;

public class Consumer {
	class CartItem {
		Product product;
		int quantity;
	}

	private String name;
	private String phoneNo;
	private Hashtable<String, CartItem> cart = new Hashtable<String, CartItem>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void addToCart(Product product, int quantity) {
		CartItem ci = new CartItem();
		ci.product = product;
		ci.quantity = quantity;
		
		cart.put(product.getName(), ci);
	}

	public void removeFromCart(Product product) {
		cart.remove(product.getName());
	}

}
