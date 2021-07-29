package com.jaa.stockportfolio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * This class returns the realtime value of stocks for the given symbols.
 * 
 * @author ashwi
 *
 */
public class StockRealtimeHandler {
	private static final String URL = "https://www.alphavantage.co/query?function=GLOBAL_QUOTE";
	private static final String APIKEY = "3Q05PSJBM8T013";
	private static final String EXCHANGE = "bse";

	public float getRealtimeStockValue(String ticker) {
		String httpURL = URL + "&" + "symbol=" + EXCHANGE + ":" + ticker + "&" + "apikey=" + APIKEY;
		try {
			callURL(httpURL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return(0);
	}

	public  void callURL(String urlString) throws Exception {
		System.out.println("URL:" + urlString);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(urlString);
		HttpResponse response = client.execute(request);

		// Get the response
		BufferedReader rd = new BufferedReader
		    (new InputStreamReader(
		    response.getEntity().getContent()));

		String line = "";
		while ((line = rd.readLine()) != null) {
		    System.out.println(line);
		}
	}

}
