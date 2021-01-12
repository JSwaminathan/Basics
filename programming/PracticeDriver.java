/**
 * 
 */
package programming;

import java.util.Scanner;

/**
 * @author ashwin
 *
 */
public class PracticeDriver {

	private static void testPrintList() {
		Practice practice = new Practice();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter final mark :");
		int mark = scanner.nextInt();
		practice.printList(mark);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testPrintList();

	}

}
