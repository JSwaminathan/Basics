package com.jaa.ds;

/**
 * @author ashwi
 *
 */
public class RegQueue extends LinkedList {
	public Queue Confirmed;

	public void enqueue(int value) {
		insertEnd(value);
	}

	public int dequeue() {
		int val = deleteEnd();
		return val;
	}

	
}
