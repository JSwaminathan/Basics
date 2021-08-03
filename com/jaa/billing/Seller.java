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
		// Based on the seller Name, read the corresponding JSON File.
		// Locate the file at "<ROOT\Data\SellerName.json

		// Convert the read JSON string to JSON object.
		// Once the data is read set the attributes -
		// Create Product
		// Set Product Name, MRP (or Price) etc

		File jsonFile = new File("C:\\Users\\arjun\\Documents\\GitHub\\Basics\\Data\\Nilgris.json");
		if (jsonFile.exists()) {
			System.out.println(jsonFile + " exists");

		} else {
			System.err.println("does not exist");
			throw new RuntimeException("file does not exist");
		}
		try {
			Scanner scanner = new Scanner(jsonFile);
			StringBuffer buffer = new StringBuffer();
			String line;
			while (scanner.hasNextLine()) {
				line = scanner.nextLine();
				buffer.append(line);
			}
			scanner.close();
			System.out.println(buffer.toString());
			String jsonString = buffer.toString();
			readJson(jsonString);

		} catch (FileNotFoundException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("file does not exist");
		}

	}

	public void readJson(String json) {
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode;
		try {

			jsonNode = objectMapper.readTree(json);
			if (jsonNode != null) {
				JsonNode parent = jsonNode.get("nilgris");
				if (parent != null) {
					System.out.println("exists");
				} else {
					throw new RuntimeException("does not exist");

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

	// TEMP
	public static void main(String[] args) {
		Seller seller = new Seller("Nilgris");
	}

}
