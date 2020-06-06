package programming;

public class LinkedList<T extends Comparable<T>> {
	protected LLNode<T> head;
	protected LLNode<T> tail;
	
	public void addNode(T value) {
		if (head == null) {
			head = tail = new LLNode<T>();
			head.setValue(value);
			return;
		}
		
		LLNode<T> node = new LLNode<T>();
		node.setValue(value);
		tail.next = node;
		tail = node;
		
	}
	
	public void print() {
		for (LLNode<T> n = head; n != null; n = n.next) {
			System.out.println("Node : " + n.toString());
		}
	}
	
	public boolean exists(T value) {
		for (LLNode<T> n = head; n != null; n = n.next) {
			if (n.getValue().compareTo(value) == 0) {
				return (true);
			}
		}
		return (false);
	}

}
