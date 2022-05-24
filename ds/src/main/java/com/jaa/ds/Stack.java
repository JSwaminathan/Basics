package com.jaa.ds;

/**
 * Stack that works on Linked List.
 * 
 * @author ashwi
 *
 */
public class Stack extends LinkedList {

	public void push(int value) {
		insertEnd(value);
	}

	public int pop() {

		try {
			int value = deleteEnd();
			return (value);
		} catch (RuntimeException e) {
			throw new RuntimeException("Empty Stack");
		}
	}

	public int peek() {
		if (tail == null) {
			throw new RuntimeException("Empty Stack");
		}

		return (tail.value);
	}

}
