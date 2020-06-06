package programming;
/**
 * Binary Tree
 */
public class BinaryTree <T extends Comparable<T>> {
	protected Node<T> root;
	
	public void addNode(T value) {
		root = addNode(root, value);
		
	}
	
	private Node<T> addNode(Node<T> node, T value) {
		if (node == null) {
			node = new Node<T>();
			node.setValue(value);
			return node;
		}
		
		
        if (value.compareTo(node.getValue()) > 0) {
			node.right = addNode(node.right, value);
		}
        else if (value.compareTo(node.getValue()) < 0) {
			node.left = addNode(node.left, value);
		} 
        // equal
        return (node);
			
	}
	
	public void print() {
	   print(root);	
	}
	
	public void print(Node <T> node) {
		if (node == null) {
			return;
		}
		print(node.getLeft());
		System.out.println("Value: " + node.getValue());
		print(node.getRight());
	}

	public boolean exists(T value) {
		return (exists(root, value));
	}

	private boolean exists(Node<T> node, T value) {
		if (node == null) {
		    return false;
		}
		
		if (node.getValue().compareTo(value) == 0) {
			return (true);
		}
		
		if (exists(node.getLeft(), value)) {
			return (true);
		}
		
		if (exists(node.getRight(), value)) {
			return (true);
		}
		
		// shouldn't come here.
		return (false);
	}
	
}
