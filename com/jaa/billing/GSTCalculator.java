package com.jaa.billing;

import java.util.Hashtable;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GSTCalculator implements GSTProvider {
	private static final String NAME = "GST";
	Hashtable<String, Float> gstTable;

	public GSTCalculator() {
		gstTable = new Hashtable<String, Float>();
		readGSTConfiguration();

	}

	private void readGSTConfiguration() {
		JsonUtils.readJsonFile(NAME);

	}

	@Override
	public float getGSTRate(String productType) {

		return 0;
	}

}
