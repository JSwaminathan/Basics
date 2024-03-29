package com.jaa.ds;

/**
 * LinkedList Driver.
 */
public class LLDriver {

	public static void testDeleteOneElemnt() {
		int value = 133;
		LinkedList llist = new LinkedList();
		llist.insertEnd(value);
		int headVal = llist.deleteFirst();
		if (headVal == value) {
			System.out.println(headVal + " test case passed ");
		} else {
			System.err.println("case failed ");

		}
		llist.print();
	}

	public static void testElementFromEnd() {
		int value1 = 133;
		int value2 = 195;
		LinkedList llist = new LinkedList();
		llist.insertEnd(value1);
		llist.insertEnd(value2);
		int tailVal = llist.deleteEnd();
		if (tailVal == value2) {
			System.out.println(tailVal + " test case passed ");
		} else {
			System.err.println("case failed ");
			// TODO
		}
		llist.print();
	}

	public static void main(String[] args) {
		testElementFromEnd();

		LinkedList llist = new LinkedList();

		llist.insertFirst(1313);
		llist.insertFirst(547);
		llist.insertFirst(123);
		llist.insertEnd(300);

		llist.print();
	}

}
