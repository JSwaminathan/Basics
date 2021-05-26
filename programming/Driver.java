package programming;
/**
 * Driver
 */

public class Driver {
	public static void main(String[] args) {
		testTree();
		//testLinkedList();
	}

	private static void testTree() {
		BinaryTree<String> tree = new BinaryTree<String>();
		
		tree.addNode("Meena");
		tree.addNode("Jayaram");
		tree.addNode("Arjun");
		tree.addNode("Ashwin");
		tree.addNode("Harsh");
		tree.addNode("Manas");
		
		tree.print();
		
		if (tree.exists("Arjun")) {
			System.out.println("Found #1" + " PASSED. ");
		} else {
			System.out.println("Did not find #1" + " FAILED. ");
		}
		
		if (tree.exists("Random")  == false) {
			System.out.print("Did not find #2 - PASSED");
		} else {
			System.out.println("Did not find #2 " + " FAILED. ");
		}
	}
	
	private static void testLinkedList() {
		SingleLinkedList<String> llist = new SingleLinkedList<String>();
		
		llist.addNode("Meena");
		llist.addNode("Jayaram");
		llist.addNode("Arjun");
		llist.addNode("Ashwin");
		llist.addNode("Harsh");
		llist.addNode("Manas");
		
		llist.print();
		
		if (llist.exists("Arjun")) {
			System.out.println("Found #1");
		}
		
		if (llist.exists("Random")  == false) {
			System.out.print("Did not Found #2");
		}
	}
	

}
