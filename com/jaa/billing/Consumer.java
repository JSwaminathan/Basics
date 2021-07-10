
package com.jaa.billing;

import java.util.*;

public class Consumer {

	private String name;
	private String phoneNo;
	private ArrayList<Product> cart = new ArrayList<Product>();

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

	public void addToCart(Product Product) {

	}

	public void removeFromCart(Product product) {

	}

}
