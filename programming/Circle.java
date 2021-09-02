package programming;

public class Circle extends Shape {
	public static final float PI = 3.14F;

	protected int radius;
	
	// Circle c = new Circle(10);

	public Circle(int radius) {
	    this.radius = radius;	
	}
	
	public void draw() {
		System.out.println("I am circle with radius " + radius);
	}

	
	public float getArea() {
		return PI * radius * radius;
	}

}
