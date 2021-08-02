package com.jaa.billing;

import java.util.Hashtable;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GSTCalculator extends Hashtable<String, Integer> {
	public GSTCalculator() {
		readGSTConfiguration();
	}

	private void readGSTConfiguration() {
		// TODO Auto-generated method stub
		
	}
	private float loadGst(String json) {
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode;
		try {
			jsonNode = objectMapper.readTree(json);
			if (jsonNode != null) {
				JsonNode parent = jsonNode.get("Global Quote");
				JsonNode priceLabel = parent.get("05. price");
				if (priceLabel != null) {
					String tickerValue = priceLabel.textValue();
					System.out.println("TICKER TEXT: " + tickerValue);
					return (Float.parseFloat(tickerValue));
				}
			}

		} catch (

		JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return -1;
	}
	
	/**
	 *  This method returns the GST for the given product including for quantity passed.
	 *  Total GST = quantity * (MRP * GstRate / 100)
	 * @param product
	 * @param quantity
	 * @return
	 */
	public double getGST(Product product, int quantity) {
		String name = product.getName();
		Integer gstRate = this.get(name);
		
		if (gstRate == null) {
			throw new RuntimeException(name + " does not exist!");
		}
		
		double totalGST = quantity * (product.getMrp() * (gstRate / 100));
		return totalGST;
	}
	
	public static void main(String[] args) {
		GSTCalculator gc = new GSTCalculator();
		
	}
}
