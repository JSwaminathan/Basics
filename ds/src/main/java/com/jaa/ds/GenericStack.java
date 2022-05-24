package com.jaa.ds;

import java.util.*;

public class GenericStack <T> {
	private Vector<T> stack;
	
	public GenericStack(int maxSize) {
		stack = new Vector<T>();
	}

	public void push(T value) {
		stack.add(value);
	}
	
	public T pop() {
		if (stack.size() == 0) {
			throw new RuntimeException("stack is empty.");
		}
		int size = stack.size();
		return (stack.remove(size - 1));
	}
	
	public int getStackSize() {
		return (stack.size());
	}
}
