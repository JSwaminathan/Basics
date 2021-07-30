package com.jaa.stockportfolio;

import java.util.ArrayList;
import java.util.List;

import com.jaa.stockportfolio.db.DBStocks;

public class PortfolioManager {
	private ArrayList<Stock> stocks = new ArrayList<Stock>();

	public void getStocks() {
		StockRealtimeHandler handler = new StockRealtimeHandler();
		
		DBStocks db = new DBStocks();
		List<StockPortfolioData> dbstocks = db.getStocks();
		System.out.println(dbstocks);
		
		// Update the Arraylist using the stocks we got from DB
		
		int i = 1001;
		
		for (StockPortfolioData spd : dbstocks) {
			Stock stock = new Stock();
			stock.setTicker(spd.getTicker());
			stock.setId(i);
			i++;
			String name = stock.getTicker();
			System.out.println("Getting price for: " + name);
			float price = handler.getRealtimeStockValue(name);
			// TODO if price is negative, then something went wrong - handle it.
			stock.setPrice(price);
			
			stocks.add(stock);
		}
		
	}

	private void updateStocks() {
		DBStocks db = new DBStocks();
		// Update all the stocks in the time-series database.
		// The prices are already retrieved by the real-time handler.
		db.updateStocks(stocks);

	}

	public static void main(String[] args) {
		PortfolioManager handler = new PortfolioManager();
		handler.getStocks();
		handler.updateStocks();
	}

}
