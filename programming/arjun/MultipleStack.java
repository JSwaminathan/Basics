package programming.arjun;

/**
 * purpose :isto push values inside the stack.. if stack is fulll add values in
 * a new stack
 * 
 * @author arjun
 *
 */

public class MultipleStack {
	public static final int MAX = 5;
	String[] s1;
	String[] s2;
	private int top;

	MultipleStack() {
		s1 = new String[MAX];
		s2 = new String[MAX];
	}

	/**
	 * purpose of the method is to push the values into the stack (last in first out
	 * )
	 */

	public void push(String value) {
		if (top < MAX) {
			s1[top] = value;
			top++;

		} else {
			throw new RuntimeException();

		}

	}

	/**
	 * purpose of this method is to remove the last element of the stack when pop
	 * method is called...
	 */
	public String pop() {
		String value = null;
		if (top > 0) {
			value = s1[top - 1];
			top-- ;

		}else {
			throw new RuntimeException();
		}
		return value;

	}

	/**
	 * peak function is used to retrieve or fetch the element which is on top
	 */

	public String peak() {
		return (null);

	}

	/**
	 * reperesents the size of the stack ...
	 */

	public int getSize() {
		return (0);

	}

}
