package programming.shape;

public class Rectangle extends Shape {

	protected int length;
	protected int breadth;

	public Rectangle(int length, int breadth) {
	    this.length = length;	
	    this.breadth = breadth;
	}

	public void draw() {
		System.out.println("I am Rectangle with length " + length + " and breadth " + breadth);
	}

	public float getArea() {
		return length * breadth;
	}

}
