package com.jaa.stockportfolio;

import java.util.ArrayList;
import java.util.List;

import com.jaa.stockportfolio.db.DBStocks;

public class PortfolioManager {
	private ArrayList<Stock> stocks = new ArrayList<Stock>();

	public void getStocks() {
		StockRealtimeHandler handler = new StockRealtimeHandler();
		/*
		DBStocks db = new DBStocks();
		List<Stock> stocks ;
		stocks = db.getStocks();
		System.out.println(stocks);
		
		*/
		handler.getRealtimeStockValue("MARUTI");
	}

	public void updateStocks() {
		DBStocks db = new DBStocks();
		db.updateStocks(stocks);

	}

	public static void main(String[] args) {
		PortfolioManager handler = new PortfolioManager();
		handler.getStocks();
		handler.updateStocks();
	}

}
