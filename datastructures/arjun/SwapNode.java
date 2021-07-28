package datastructures.arjun;

public class SwapNode {
	class Node {
		Node next;
		int data;

		public Node(int data) {
			this.data = data;
			this.next = null;

		}

	}

	public Node head;
	public Node tail;

	public void addNode(int data) {
		Node newNode = new Node(data); // if list is empty both head and tail will point to the new node
		// if it is not empty the new node added in the linked list will become the new tail.
		if (head == null) {
			head = newNode;
			tail = newNode;

		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void swapNode() {

	}

	public static void main(String[] args) {
		SwapNode node = new SwapNode();
		node.addNode(1);
		node.addNode(2);
		node.addNode(3);
		node.addNode(4);
		node.addNode(5);
	}

}