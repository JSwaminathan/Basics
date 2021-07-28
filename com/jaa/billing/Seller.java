package com.jaa.billing;

import java.util.ArrayList;

public class Seller {
	private String name;
	private ArrayList<Product> productList = new ArrayList<Product>();
	private String contactNo;
	
	public Seller(String name) {
		readProductList();
	}

	public String getName() {
		return name;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	private void readProductList() {

	}
}
