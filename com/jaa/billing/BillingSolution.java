package com.jaa.billing;

import org.apache.log4j.Logger;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class BillingSolution {
	public static final String NILGRIS = "Nilgris";
	public static final String HY = "HyperMarket";
	public static final String GREENS = "Greens";
	

	/* Get the class name to be printed on */
	static Logger log = Logger.getLogger(BillingSolution.class.getName());

	HashMap<String, Seller> sellers;
	GSTCalculator calc;

	private void initializeSellers() {
		log.info("Initializing sellers system");
		try {
			sellers = new HashMap<String, Seller>();
			log.info("Creating seller :" + NILGRIS);
			Seller nilgris = new Seller(NILGRIS);
			log.info("Creating seller :" + HY);
			Seller hy = new Seller(HY);
			log.info("Creating seller :" + GREENS);
			Seller greens = new Seller(GREENS);
			sellers.put(NILGRIS, nilgris);
			sellers.put(HY, hy);
			sellers.put(GREENS, greens);
		} catch (RuntimeException e) {
			log.error("Error:" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	private void initializeGST() {
		log.info("Initializing GST");
		calc = new GSTCalculator();
	}

	public static void main(String[] args) {
		BillingSolution sol = new BillingSolution();
		sol.initializeSellers();
		sol.initializeGST();
		
	}
}
