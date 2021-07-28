package programming.arjun;

import java.io.IOException;

import com.jaa.schoolmgmt.Student;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestCases {
	public static void main(String[] args) {
		// testMin();
		// testRange();
		try {
			testJSON(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void testJSON(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();

		String jsonInput = "{\"id\":0,\"name\":\"Arjun\",\"email\":\"arjun@gmail.com\"}";
		Student q = mapper.readValue(jsonInput, com.jaa.schoolmgmt.Student.class);
		System.out.println("Read and parsed Person from JSON: " + q);

//		Student p = new Person("Roger", "Rabbit");
//		System.out.print("Person object " + p + " as JSON = ");
//		mapper.writeValue(System.out, p);
	}

	public static void testQueue() {
		Queue q = new Queue();

		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}

	public static void testRange() {
		int[] arr = { 5, 100, 45, 98, 50 };
		int size = arr.length;
		int lbound = 4;
		int ubound = 45;

		Practice practice = new Practice();
		int[] range = practice.getRange(arr, size, lbound, ubound);
		// printArray(range, size);

		if (range[0] == 5 && range[1] == 45) {
			System.out.println("testRange :: TC 1 - PASSED");
		} else {
			System.out.println("testRange :: TC 1 - FAILED");
		}

		// Negative case!
		if (range[0] == 5 && range[1] == 45 && range[2] == 50) {
			System.out.println("testRange :: TC 2 - FAILED");
		} else {
			System.out.println("testRange :: TC 2 - PASSED");
		}
	}

	public static void printArray(int[] arr, int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static void testMin() {
		// Instantiate your class.
		// Call the method and get the out put.
		// If output is as expected (programmatically
		// print TC passed
		// else
		// print TC failed
		Practice practice = new Practice();
		int val = practice.getMin(5, 3);

		if (val == 3) {
			System.out.println("testMin :: TC 1 - PASSED");
		} else {
			System.out.println("testMin :: TC 1 - FAILED");
		}
	}
}
