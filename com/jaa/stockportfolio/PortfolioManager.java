package com.jaa.stockportfolio;

import java.util.ArrayList;

import com.jaa.stockportfolio.db.DBStocks;

public class PortfolioManager {
	private ArrayList<Stock> stocks = new ArrayList<Stock>();

	public void getStocks() {
	}

	public void updateStocks() {
		DBStocks db = new DBStocks();
		db.updateStocks(stocks);

	}

	public static void main(String[] args) {
		PortfolioManager handler = new StockHandler();
		handler.getStocks();
		handler.updateStocks();
	}

}
