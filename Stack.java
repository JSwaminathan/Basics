package programming;

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

	public int size() {
		int count = 0;
		for (LLNode node = head; node != null; node = node.next, count++)
			; // count is done in inc/dec block.
		return (count);
	}
}
