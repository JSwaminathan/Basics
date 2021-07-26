package com.jaa.stockportfolio;

public class Stock {
	private float price;
	private int seqID;
	private String symbol;
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getSeqID() {
		return seqID;
	}
	public void setSeqID(int seqID) {
		this.seqID = seqID;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
}
