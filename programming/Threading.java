package programming;

public class Threading {
	public static final int MAX = 5000;

	public static void main(String[] args) {
		MyRunner run1 = new MyRunner(1);
		MyRunner run2 = new MyRunner(2);
		MyRunner run3 = new MyRunner(3);
		MyRunner run4 = new MyRunner(4);
		MyRunner run5 = new MyRunner(5);

		System.out.println("Start Time: " + (new java.util.Date()).toString());
		Thread t1 = new Thread(run1);
		Thread t2 = new Thread(run2);
		Thread t3 = new Thread(run3);
		Thread t4 = new Thread(run4);
		Thread t5 = new Thread(run5);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		System.out.println("End Time: " + (new java.util.Date()).toString());
	}
}

class MyRunner implements Runnable {
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
