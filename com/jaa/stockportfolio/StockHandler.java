package com.jaa.stockportfolio;

import java.util.ArrayList;

import com.jaa.stockportfolio.db.DBStocks;

public class StockHandler {
	private ArrayList<Stock> stocks = new ArrayList<Stock>();

	public ArrayList<Stock> getStocks() {

		Stock stock = new Stock();
		stock.setPrice(30);
		stock.setTicker("hcl");
		stock.setId(1);
		stocks.add(stock);

		Stock stock1 = new Stock();
		stock1.setPrice(1200);
		stock1.setTicker("mrf");
		stock1.setId(1);
		stocks.add(stock1);

		Stock stock2 = new Stock();
		stock2.setPrice(80);
		stock2.setTicker("tata steel");
		stock2.setId(1);
		stocks.add(stock2);

		return stocks;

	}

	public void updateStocks() {
		DBStocks db = new DBStocks();
		db.updateStocks(stocks);

	}

	public static void main(String[] args) {
		StockHandler handler = new StockHandler();
		handler.getStocks();
		handler.updateStocks();
	}

}
