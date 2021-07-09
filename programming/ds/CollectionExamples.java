package programming.ds;


import java.util.*;

public class CollectionExamples {
	public void testHashTable() {
		
		Hashtable<Integer, String> hash = new Hashtable<Integer, String>();
		hash.put(1, "Ashwin");
		hash.put(2, "Arjun");
		hash.put(3, "xyz");
		String val1=hash.get(1);
		//System.out.println(val1);
		String val2=hash.get(4);
		//System.out.println(val2);
		
		Enumeration<String> names=hash.elements();
		while(names.hasMoreElements()) {
			System.out.println(names.nextElement());
		}
		hash.remove(2);
		Enumeration<String> names2=hash.elements();
		while(names2.hasMoreElements()) {
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
	 * add 'n' strings and print them
	 */

	public void testArrayList() {
		ArrayList<String> arrayList = new ArrayList<String>();
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
		c.testHashTable();

	}

}
