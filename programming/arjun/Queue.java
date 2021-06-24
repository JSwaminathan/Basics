package programming.arjun;

/**
 * to implement queue using stack 
 *
 */

import java.util.*;

public class Queue {
	private Stack<Integer> stack1;
	private Stack<Integer> stack2;

	public Queue() {
		stack1 = new Stack<Integer>();
		stack2 = new Stack<Integer>();

	}

	/**
	 * To addd an element into a queue.
	 * @param x
	 */
	public void enqueue(int x) {
		stack1.push(x);

	}

	/**
	 * Remove an element from a queue.
	 * @return
	 */
	public int dequeue() {
		int x;
		if (stack1.empty()) {
			System.out.println("error");
			throw new RuntimeException();
		}

		while (!stack1.empty()) {
			x = stack1.pop();
			stack2.push(x);
		}

		x = stack2.pop();
		while (!stack2.empty()) {
			int value = stack2.pop();
			stack1.push(value);
		}
		
		return x;
		
	}
}
