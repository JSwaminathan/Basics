package com.jaa.billing;

import java.util.Hashtable;

public class GSTCalculator extends Hashtable<String, Integer> {
	public GSTCalculator() {
		readGSTConfiguration();
	}

	private void readGSTConfiguration() {
		// TODO Auto-generated method stub
		
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
