package programming;

public class Parallelogram extends Shape {

		protected int length;
		protected int height;
		

		public Parallelogram(int len,int height) {
		    this.length = len;
		    this.height=height;
		}
		
		public void draw() {
			System.out.println("I am Parallelogram with len "+length+" and height " + height);
		}

		
		public float getArea() {
			return  (1/2)*length*height;
		}

	}

