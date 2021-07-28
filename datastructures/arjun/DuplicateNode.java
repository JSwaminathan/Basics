package datastructures.arjun;

import java.util.*;

public class DuplicateNode {
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
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			tail = newnode;
		} else {
			tail.next = newnode;
			tail = newnode;
		}
	}

	public void removeDuplicate() {
		Node current = head;
		while (current != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}

	}

	public static void main(String[] args) {
		DuplicateNode node = new DuplicateNode();
		node.addNode(1);
		node.addNode(2);
		node.addNode(2);
		node.addNode(2);
		node.removeDuplicate();
		System.out.println();

	}

	// to find the duplicate element in a singular linked list .

}
