package programming.shape;

import java.util.ArrayList;
import java.util.Scanner;

public class ShapeDesigner {
	private ArrayList<Shape> shapes;
	
	public ShapeDesigner() {
	    shapes = new ArrayList<Shape>();	
	}
	
	public void add(Shape shape) {
		shapes.add(shape);
	}
	
	public void printAllShapes() {
		for (Shape shape : shapes) {
			shape.draw();
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ShapeDesigner sd = new ShapeDesigner();
		
		loop:
		while (true) {
			System.out.println("Enter 1. Ciurcle, 2. Rectangle,3.parallelogram -1.exit ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter radius: ");
				int radius = scanner.nextInt();
				Circle circle = new Circle(radius);
				sd.add(circle);
				
				break;
			case 2:
				System.out.println("Enter length, breadth : ");
				int length = scanner.nextInt();
				int breadth = scanner.nextInt();
				Rectangle rectangle = new Rectangle(length, breadth);
				sd.add(rectangle);
				break;
			case -1:
				sd.printAllShapes();
				break loop;
			case 3:
				System.out.println("Enter length, height : ");
				int len = scanner.nextInt();
				int height = scanner.nextInt();
				Parallelogram parallelogram = new Parallelogram(len, height);
				sd.add(parallelogram);
				break;
			default:
				System.err.println("Wrong choice!  Try again! ");
			}
		}
	}
}
