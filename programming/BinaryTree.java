package programming;
/**
 * Binary Tree
 */
public class BinaryTree <T extends Comparable<T>> {
	protected TreeNode<T> root;
	
	public void addNode(T value) {
		root = addNode(root, value);
		
	}
	
	private TreeNode<T> addNode(TreeNode<T> TreeNode, T value) {
		if (TreeNode == null) {
			TreeNode = new TreeNode<T>();
			TreeNode.setValue(value);
			return TreeNode;
		}
		
		
        if (value.compareTo(TreeNode.getValue()) > 0) {
			TreeNode.right = addNode(TreeNode.right, value);
		}
        else if (value.compareTo(TreeNode.getValue()) < 0) {
			TreeNode.left = addNode(TreeNode.left, value);
		} 
        // equal
        return (TreeNode);
			
	}
	
	public void print() {
	   print(root);	
	}
	
	public void print(TreeNode <T> TreeNode) {
		if (TreeNode == null) {
			return;
		}
		print(TreeNode.getLeft());
		System.out.println("Value: " + TreeNode.getValue());
		print(TreeNode.getRight());
	}

	public boolean exists(T value) {
		return (exists(root, value));
	}

	private boolean exists(TreeNode<T> TreeNode, T value) {
		if (TreeNode == null) {
		    return false;
		}
		
		if (TreeNode.getValue().compareTo(value) == 0) {
			return (true);
		}
		
		if (exists(TreeNode.getLeft(), value)) {
			return (true);
		}
		
		if (exists(TreeNode.getRight(), value)) {
			return (true);
		}
		
		// shouldn't come here.
		return (false);
	}
	
}
