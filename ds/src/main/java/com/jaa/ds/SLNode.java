package com.jaa.ds;

/**
 * LinkedList Node 
 */
public class SLNode <T extends Comparable<T>> {
	private T value;
	protected SLNode<T> next;
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public SLNode<T> getNext() {
		return next;
	}
	public void setNext(SLNode<T> next) {
		this.next = next;
	}
	
	public String toString() {
		return(value.toString());
	}

}
