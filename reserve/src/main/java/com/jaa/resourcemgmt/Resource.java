package com.jaa.resourcemgmt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Resource {
	public static final int WL_MAX_SIZE = 10;
	
	private String name;
	private int absoluteLimit;
	private int individualLimit;
	
	ArrayList<Integer> reservedList;
	Queue<Integer> wl;
	
	public Resource() {
		reservedList = new ArrayList<Integer>();
		wl = new LinkedList<Integer>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAbsoluteLimit() {
		return absoluteLimit;
	}
	public void setAbsoluteLimit(int absoluteLimit) {
		this.absoluteLimit = absoluteLimit;
	}
	public int getIndividualLimit() {
		return individualLimit;
	}
	public void setIndividualLimit(int individualLimit) {
		this.individualLimit = individualLimit;
	}
	
	

}
