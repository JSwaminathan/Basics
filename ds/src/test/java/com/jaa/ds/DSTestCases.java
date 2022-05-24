package com.jaa.ds;

import java.util.HashSet;
import java.util.Set;

/**
 * Driver
 */

public class DSTestCases {
	public static void main(String[] args) {
		testGenericStack();
	}

	private static void testGenericStack() {
		GenericStack<Integer> stack = new GenericStack<Integer>(1000);
		stack.push(100);
		stack.push(500);
		int value1 = stack.pop();
		System.out.println("value1 is " + value1);
		int value2 = stack.pop();
		System.out.println("value1 is " + value2);
		
		
		GenericStack<String> namesStack = new GenericStack<String>(1000);
		namesStack.push("Ashwin");
		namesStack.push("Jay");
		String val1 = namesStack.pop();
		System.out.println("value1 is " + val1);
		String val2 = namesStack.pop();
		System.out.println("value1 is " + val2);
		
	}

	private static void testTree() {
		BinaryTree<String> tree = new BinaryTree<String>();

		tree.addNode("Meena");
		tree.addNode("Jayaram");
		tree.addNode("Arjun");
		tree.addNode("Ashwin");
		tree.addNode("Harsh");
		tree.addNode("Manas");

		tree.print();

		if (tree.exists("Arjun")) {
			System.out.println("Found #1" + " PASSED. ");
		} else {
			System.out.println("Did not find #1" + " FAILED. ");
		}

		if (tree.exists("Random") == false) {
			System.out.print("Did not find #2 - PASSED");
		} else {
			System.out.println("Did not find #2 " + " FAILED. ");
		}
	}

	/**
	 * this method is a tester fo stack of linkedlists
	 */
	private static void testStack() {
		Stack st = new Stack();
		st.push(2323);
		st.push(123234);
		st.push(234);

		st.print();
		int val = st.pop();
		System.out.print(val);
		System.out.println("peek:" + st.peek());
	}

	private static void testQueue() {
		RegQueue q = new RegQueue();
		q.enqueue(2134);
		q.enqueue(2134);
		q.enqueue(2134);
		int val = q.dequeue();
		System.out.println(val);

	}

	private static void testLinkedList() {
		SingleLinkedList<String> llist = new SingleLinkedList<String>();

		llist.addNode("Meena");
		llist.addNode("Jayaram");
		llist.addNode("Arjun");
		llist.addNode("Ashwin");
		llist.addNode("Harsh");
		llist.addNode("Manas");

		llist.print();

		if (llist.exists("Arjun")) {
			System.out.println("Found #1");
		}

		if (llist.exists("Random") == false) {
			System.out.print("Did not Found #2");
		}
	}


}
