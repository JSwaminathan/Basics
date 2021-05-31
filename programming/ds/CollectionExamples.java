package programming.ds;

import java.util.ArrayList;
import java.util.Vector;

public class CollectionExamples {

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
		c.testVectorList();

	}

}
