package programming;

public class LLNode <T extends Comparable<T>> {
	private T value;
	protected LLNode<T> next;
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public LLNode<T> getNext() {
		return next;
	}
	public void setNext(LLNode<T> next) {
		this.next = next;
	}
	
	public String toString() {
		return(value.toString());
	}

}
