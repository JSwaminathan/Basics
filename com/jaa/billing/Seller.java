package com.jaa.billing;

import java.util.ArrayList;

public class Seller {
	private String name;
	private ArrayList<Product> productList = new ArrayList<Product>();
	private String contactNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
