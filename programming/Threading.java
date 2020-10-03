package programming;

public class Threading {
	public static final int MAX = 20;

	public static void main(String[] args) {
		MyRunner run1 = new MyRunner(1);
		MyRunner run2 = new MyRunner(2);
		MyRunner run3 = new MyRunner(3);
		MyRunner run4 = new MyRunner(4);
		MyRunner run5 = new MyRunner(5);
		
		System.out.println("Start Time: " + (new java.util.Date()).toString());
		run1.start();
		run2.start();
		run3.start();
		run4.start();
		run5.start();
		
		System.out.println("End Time: " + (new java.util.Date()).toString());
	}
}

class MyRunner extends Thread {
	int myNumber;

	MyRunner(int myNumber) {
		this.myNumber = myNumber;
	}

	public void run() {
		for (int i = 1; i <= Threading.MAX; i++) {
			System.out.println("hi i am # " + myNumber + " iteration: " + i);
		}

	}
}
