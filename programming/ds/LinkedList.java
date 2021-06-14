package programming.ds;

/**
 * A Single link list DS with basic operations.
 * 
 * @author ashwi
 *
 */
public class LinkedList {

	protected LLNode head;
	protected LLNode tail;

	/**
	 * Insert at the tail of the list.
	 * 
	 * @param value
	 */
	public void insertEnd(int value) {
		if (head == null) {
			firstLLNode(value);
			return;
		}

		// Create a LLNode
		LLNode LLNode = new LLNode();
		LLNode.value = value;
		LLNode.next = null;

		tail.next = LLNode; // The previous last element must point to the new LLNode.
		tail = LLNode;
	}

	/**
	 * Insert at the beginning of the list.
	 * 
	 * @param value
	 */
	public void insertFirst(int value) {
		if (head == null) {
			firstLLNode(value);
			return;
		}
		LLNode LLNode = new LLNode();
		LLNode.value = value;
		LLNode.next = head;
		head = LLNode;
	}

	private void firstLLNode(int value) {

		// Coming for first time.
		LLNode LLNode = new LLNode();
		LLNode.value = value;
		LLNode.next = null;

		head = tail = LLNode;
		return;

	}

	/**
	 * Delete the first element of the list. and return the value of 1st element
	 * 
	 * @return
	 */
	public int deleteFirst() {

		if (head == null) {

			return (-1);
		}

		int headVal = head.value;
		if (head == tail) {// there is only a single LLNode
			head = tail = null;

		} else {
			head = head.next;
		}
		return headVal;
	}

	/**
	 * Delete the last element of the list.
	 * 
	 * @return
	 */

	public int deleteEnd() {
		if (head == null) {
			throw new RuntimeException("Empty LL");
		}
		if (head == tail) { // single LLNode case
			return (deleteFirst());
		}

		LLNode prevLLNode = head;

		for (LLNode LLNode = head.next; LLNode.next != null; LLNode = LLNode.next) {
			prevLLNode = LLNode;
		}
		int value = tail.value;
		prevLLNode.next = null;
		tail = prevLLNode;

		return (value);
	}

	public void print() {
		for (LLNode node = head; node != null; node = node.next) {
			System.out.println("Value: " + node.value);
		}

	}

	public int size() {
		int count = 0;
		for (LLNode node = head; node != null; node = node.next) {
			count++;
		}

		return (count);
	}
}
