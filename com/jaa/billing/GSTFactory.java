package com.jaa.billing;

public class GSTFactory {
	private static GSTProvider provider;
	
	public static GSTProvider getGSTProvider() {
		if (provider == null) {
			provider = new GSTCalculator();
		}
		
		return (provider);
	}

}
