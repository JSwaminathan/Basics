package programming.arjun;

//to implement queue using stack 
//principle of queue -> first in first out 
/*principle of stack -> last in first out 
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

	public void enqueue(int x) {
		stack1.push(x);

	}

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
