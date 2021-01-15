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

	private static void compareArray() {
		Practice practice = new Practice();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");

		int length = scanner.nextInt();
		int[] array1 = new int[length];
		int[] array2 = new int[length];

		System.out.println("Enter the elements of  array 1:");
		for (int i = 0; i < length; i++) {
			array1[i] = scanner.nextInt();
		}
		System.out.println("Enter the elements of  array 2:");
		for (int i = 0; i < length; i++) {

			array2[i] = scanner.nextInt();

		}
		practice.compareArray(array1, array2);
	}

	private static void findDuplicate() {

		Practice practice = new Practice();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter size of array");

		int length = scanner.nextInt();
		int[] array = new int[length];

		System.out.println("Enter the elements of the  array :");
		for (int i = 0; i < length; i++) {

			array[i] = scanner.nextInt();
		}
		int[] duplicate = practice.findDuplicate(array);
		for (int i = 0; i < length; i++) {

			System.out.print(duplicate[i]);
		}
	}

	private static void checkPrefix() {
		String s1 = "Hello World";
		String s2 = "World";
		System.out.println((new Practice()).checkPrefix(s1, s2));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		checkPrefix();

	}

}
