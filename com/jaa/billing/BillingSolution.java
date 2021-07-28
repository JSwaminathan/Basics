package com.jaa.billing;

import org.apache.log4j.Logger;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class BillingSolution {
	/* Get the class name to be printed on */
	static Logger log = Logger.getLogger(BillingSolution.class.getName());

	public static void main(String[] args) throws IOException, SQLException {
		log.debug("Initializing gst calculator");
		log.info("Hello this is an info message");
		log.warn("gst not wrriten");
	}
}
