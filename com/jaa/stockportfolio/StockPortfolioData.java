package com.jaa.stockportfolio;

public class StockPortfolioData {
	private int quantity ;
	private String ticker ;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	
	public String toString() {
		return ("ticker: " + ticker + " : " + quantity);
	}
}