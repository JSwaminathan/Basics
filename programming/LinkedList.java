package programming;

/**
 * A Single link list DS with basic operations.
 * 
 * @author ashwi
 *
 */
public class LinkedList {

	private Node head;
	private Node tail;

	/**
	 * Insert at the tail of the list.
	 * 
	 * @param value
	 */
	public void insertEnd(int value) {
		if (head == null) {
			firstNode(value);
			return;
		}

		// Create a node
		Node node = new Node();
		node.value = value;
		node.next = null;

		tail.next = node; // The previous last element must point to the new node.
		tail = node;
	}

	/**
	 * Insert at the beginning of the list.
	 * 
	 * @param value
	 */
	public void insertFirst(int value) {
		if (head == null) {
			firstNode(value);
			return;
		}
		Node node = new Node();
		node.value = value;
		node.next = head;
		head = node;
	}

	private void firstNode(int value) {

		// Coming for first time.
		Node node = new Node();
		node.value = value;
		node.next = null;

		head = tail = node;
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
		if (head == tail) {// there is only a single node
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
	public int xyz() {
		if (head == null) {
			return (-1);
		}
		if (head == tail) { // single node case
			return (deleteFirst());
		}
		
		Node prevNode = head;
		
		for (Node node = head.next; node.next != null; node = node.next) {
			prevNode = node;
		}
		int value = tail.value;
		prevNode.next = null;
		tail = prevNode;
		
		return (value);
	}
	public int deleteEnd() {
		int value=tail.value;
		if (head == null) {
			return (-1);
		}
		if (head == tail) { // single node case
			return (deleteFirst());
		}
		
		  Node second_last = head;
	        while (second_last.next.next != null)
	            second_last = second_last.next;
	 
	        // Change next of second last
	        second_last.next = null;
	 
	        return value;
	}

	public void print() {
		for (Node node = head; node != null; node = node.next) {
			System.out.println("Value: " + node.value);
		}

	}

}
