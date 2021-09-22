package com.jaa.billing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Seller {
	private String name;
	private ArrayList<Product> productList = new ArrayList<Product>();
	private String contactNo;

	public Seller(String name) {
		readProductList(name);
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

	private void readProductList(String name) {

		String jsonString = JsonUtils.readJsonFile(name);
		readJson(jsonString, name);
	}

	public void readJson(String json, String name) {
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode;
		try {

			jsonNode = objectMapper.readTree(json);
			if (jsonNode != null) {
				JsonNode parent = jsonNode.get(name);
				if (parent != null) {
					System.out.println(name + "  root exists exists");
				} else {
					throw new RuntimeException(name + "  root does NOT exist");

				}
				Iterator<JsonNode> js = jsonNode.iterator();
				if (js.hasNext()) {
					JsonNode jarray = js.next();
					Iterator<JsonNode> jelements = jarray.iterator();
					while (jelements.hasNext()) {
						JsonNode j = jelements.next();
						System.out.println("Got: " + j);
						addProduct(j);
					}

				}
			}

		} catch (

		JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void addProduct(JsonNode jproduct) {
		String name = jproduct.get("name").textValue();
		String price = jproduct.get("price").textValue();
		String manufacturer = jproduct.get("manufacturer").textValue();
		System.out.println("name: " + name + " price: " + price + " manufacturer: " + manufacturer);
		Product product = new Product();
		product.setName(name);
		product.setMrp(Float.parseFloat(price));
		product.setManufacturer(manufacturer);
		productList.add(product);

	}

}
