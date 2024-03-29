package com.jaa.ds;

import java.util.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class CollectionExamples {
	public void testHashTable() {

		Hashtable<Integer, String> hash = new Hashtable<Integer, String>();
		hash.put(1, "Ashwin");
		hash.put(2, "Arjun");
		hash.put(3, "xyz");
		String val1 = hash.get(1);
		// System.out.println(val1);
		String val2 = hash.get(4);
		// System.out.println(val2);

		Enumeration<String> names = hash.elements();
		while (names.hasMoreElements()) {
			System.out.println(names.nextElement());
		}
		hash.remove(2);
		Enumeration<String> names2 = hash.elements();
		while (names2.hasMoreElements()) {
			System.out.println(names2.nextElement());
		}

	}

	public void testVectorList() {
		Vector<String> v = new Vector<String>();
		v.add("ashwin");
		v.add("meena");
		v.add("arjun");
		for (String name : v) {
			System.out.println(name);
		}

		String element = v.elementAt(1);
		if (element.equalsIgnoreCase("ashwin")) {
			System.out.println("test case failed : valueMatch TC4");
		} else {
			System.out.println("test case passed : valueMatch TC4");
		}
		if (element.equalsIgnoreCase("meena")) {

			System.out.println("test case passed : valueMatch TC4");
		} else {
			System.out.println("test case failed : valueMatch TC4");

		}
	}

	/**
	 * this collection is used for faster retrival of data and keep unique elements.
	 * distributes into buckets as the underlying implementation is based on
	 * hashtable
	 * 
	 */
	public void testLinkedHashSet() {
		LinkedHashSet<String> hashset = new LinkedHashSet<String>();
		hashset.add("Ashwin");
		hashset.add("Arjun");
		hashset.add("axol");
		hashset.add("zayan");
		for (String name : hashset) {
			System.out.println("name:" + name);
		}
		hashset.remove("axol");
		for (String name : hashset) {
			System.out.println("name:" + name);
		}
		ArrayList<String> list = new ArrayList<String>();
		list.add("rahul");
		list.add("max");
		list.add("cyrus");
		
		hashset.addAll(list);
		
		for (String name : hashset) {
			System.out.println("name:" + name);
		}
	}

	/**
	 * add 'n' strings and print them
	 */
	public void testArrayList() {
		ArrayList<String> arrayList = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		arrayList.add("ashwin");
		arrayList.add("arjun");
		arrayList.add("meena");
		arrayList.add("J");
		for (String name : arrayList) {
			System.out.println(name);
		}
		if (arrayList.contains("ashwin")) {
			System.out.println("test case passed : contains TC1 ");
		} else {
			System.out.println("test case failed : contains TC1");
		}
		if (arrayList.contains("ash")) {
			System.out.println("test case failed : contains TC2");
		} else {
			System.out.println("test case passed : contains TC2");
		}

		arrayList.remove("J");
		if (arrayList.contains("J")) {
			System.out.println("test case failed : remove TC3 ");
		} else {
			System.out.println("test case passed : remove TC3");
		}
	}

	public static void main(String[] args) {
		CollectionExamples c = new CollectionExamples();
		c.testLinkedHashSet();

	}

}
