package com.jaa.billing;

public interface GSTProvider {
	/**
	 * Given the product type, provide the GST rate as a percentage.
	 * @param productType
	 * @return
	 */
	public float getGSTRate(String productType);

}
