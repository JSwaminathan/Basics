package programming;

/**
 *  Node
 */
public class Node<T extends Comparable<T>> {
	protected T value;
	Node<T> left;
	Node<T> right;
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getLeft() {
		return left;
	}
	public void setLeft(Node<T> left) {
		this.left = left;
	}
	public Node<T> getRight() {
		return right;
	}
	public void setRight(Node<T> right) {
		this.right = right;
	}
	public String toString() {
		return (value.toString());
	}

}
