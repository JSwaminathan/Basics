package com.jaa.stockportfolio;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

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
		return (0);
	}

	public float callURL(String urlString) throws Exception {
		System.out.println("URL:" + urlString);
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(urlString);
		HttpResponse response = client.execute(request);
		StringBuffer buffer = new StringBuffer();

		// Get the response
		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		String line = "";
		while ((line = rd.readLine()) != null) {
			buffer.append(line);
		}
		String json = buffer.toString();
		System.out.println("Received: " + json);

		float ticker = getTickerPrice(json);

		return (ticker);
	}

	private float getTickerPrice(String json) {
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode;
		try {
			jsonNode = objectMapper.readTree(json);
			if (jsonNode != null) {
				JsonNode parent = jsonNode.get("Global Quote");
				JsonNode ticker = parent.get("05. price");
				if (ticker != null) {
					String tickerValue = ticker.textValue();
					System.out.println("TICKER TEXT: " + tickerValue);
					return (Float.parseFloat(tickerValue));
				}
			}

		} catch (

		JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return -1;
	}

}
