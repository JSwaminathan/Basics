package programming;

public class SingleLinkedList<T extends Comparable<T>> {
	protected SLNode<T> head;
	protected SLNode<T> tail;

	public void addNode(T value) {
		if (head == null) {
			head = tail = new SLNode<T>();
			head.setValue(value);
			return;
		}

		SLNode<T> node = new SLNode<T>();
		node.setValue(value);
		tail.next = node;
		tail = node;

	}

	public void print() {
		for (SLNode<T> n = head; n != null; n = n.next) {
			System.out.println("Node : " + n.toString());
		}
	}

	public boolean exists(T value) {
		for (SLNode<T> n = head; n != null; n = n.next) {
			if (n.getValue().compareTo(value) == 0) {
				return (true);
			}
		}
		return (false);
	}

}