/**
 * 
 */
package programming;

import java.util.HashMap;
import java.util.List;

import java.util.Scanner;

/**
 * @author ashwin
 *
 */
public class PracticeDriver {

	private static void testMatrixAddition() {
		MatrixOperations mo = new MatrixOperations();

		Matrix m1 = new Matrix(3, 3);// size of matrix 3 X 3
		Matrix m2 = new Matrix(3, 3);

		int row = m1.getRowCount();
		int col = m1.getColCount();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				m1.setValue(i, j, i + j);
			}

		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				m2.setValue(i, j, i + j + 25);
			}
		}
		Matrix sum = mo.addMatrices(m1, m2);
		mo.printMatrix(sum);
	}

	private static void testPrintList() {
		Practice practice = new Practice();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter final mark :");
		int mark = scanner.nextInt();
		practice.printList(mark);
	}

	public static int[] returnNewArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array  :");

		int length = scanner.nextInt();
		int[] num1 = new int[length];

		System.out.println("Enter the elements of the  array :");
		for (int i = 0; i < length; i++) {

			num1[i] = scanner.nextInt();
		}

		return num1;
	}

	private static void printLeaders() {
		Practice prac = new Practice();
		int arr[] = returnNewArray();
		prac.printLeaders(arr);

	}

	public static void addArrayElements() {
		int[] array = { 11, 14, 12, 13, 4, 5, 16, 24, 9 };

		int[] array2 = new int[array.length / 2];
		Practice prac = new Practice();
		prac.addArrayElements(array, array2);
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

	public static void investment() {
		boolean flag = true;
		Practice practice = new Practice();
		System.out.println("How many types of investments would you like to invest in :");
		Scanner scanner = new Scanner(System.in);

		int size = scanner.nextInt();
		if (size <= 0) {
			throw new RuntimeException("you need to invest in atleast  one type of investment ! ");

		}
		int[] investments = new int[size];

		while (flag == true) {
			System.out.println("Enter the contribution :");
			int contribution = scanner.nextInt();
			if (contribution <= 0) {
				throw new RuntimeException("investment value is low  ");
			}

			System.out.println("Enter the Starting index");
			int start = scanner.nextInt();
			System.out.println("Enter the ending index :");
			int end = scanner.nextInt();
			practice.investment(size, investments, contribution, start, end);
			System.out.println("would you like to continue  Yes/No");
			String responce = scanner.next();
			if (responce.equalsIgnoreCase("NO")) {

				int maxIvestment = 0;
				for (int i = 0; i < investments.length; i++) {
					if (investments[i] > maxIvestment) {
						maxIvestment = investments[i];
					}

				}
				flag = false;
				System.out.println("Thank you for investing your maximum investment was :" + maxIvestment);
			}

		}

	}

	/**
	 * 
	 */
	public static void encodeDecodeString() {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		HashMap<Character, String> hm = new HashMap<Character, String>();
		HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();
		HashMap<String, Integer> counter2 = new HashMap<String, Integer>();
		// System.out.println((int) 'g' - (int) 'a' + 1 + "#");
		System.out.println("Enter the alphabets to be encoded and decoded");
		Scanner scanner = new Scanner(System.in);
		String val = scanner.next();
		int size = val.length();
		char[] alpha = new char[size];
		for (int i = 0; i < size; i++) {

			alpha[i] = val.charAt(i);
			if ((alpha[i] > 'a' && alpha[i] < 'z')) {

				// throw new RuntimeException("string needs to be a lowercase english alphabet
				// ");
			}
		}

	}

	public static void StringEquality() {
		Practice practice = new Practice();
		boolean val = practice.StringEquality();
		System.out.println(val);

	}

	public static void rotateClockWise() {
		int array[] = returnNewArray();
		System.out.println("Enter number of rotates to be made ");
		Scanner scanner = new Scanner(System.in);
		int rotate = scanner.nextInt();

		Practice prac = new Practice();
		int returnedArray[] = prac.rotateClockWise(array, rotate);
		for (int i = 0; i < returnedArray.length; i++) {
			System.out.println(returnedArray[i]);
		}

	}

	private static void findSumOfDistinctElements() {
		Scanner scanner = new Scanner(System.in);
		Practice prac = new Practice();
		int array[] = null;
		int array2[] = null;
		array = returnNewArray();
		array2 = returnNewArray();
		System.out.println("enter the number for elemets to be equal");
		int num = scanner.nextInt();
		prac.findSumOfDistinctElements(array, array2, num);

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

	private static void findSecondSmallestElement() {
		int n = 0;
		Practice practice = new Practice();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");

		int length = scanner.nextInt();
		int[] array1 = new int[length];

		System.out.println("Enter the elements of  array 1:");
		for (int i = 0; i < length; i++) {
			array1[i] = scanner.nextInt();
		}
		System.out.println("Enter the nth term");
		n = scanner.nextInt();

		int element = practice.findSecondSmallestElement(array1, n);
		System.out.println(" second smallest element present in given array: " + element);
	}

	public static void findFrequency() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = scanner.nextLine();
		System.out.println("enter the second string ");
		String str2 = scanner.nextLine();

		System.out.print("");
		System.out.print("");
		System.out.print("");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("						HISTOGRAM OF FREQUENCY OF CHARECTERS IN A SENTENCE ");
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(" ");

		Practice.findFrequency(str, str2);
	}

	private static void getUniqueNumbers() {
		Practice practice = new Practice();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter size of array");

		int length = scanner.nextInt();
		int[] num1 = new int[length];

		System.out.println("Enter the elements of the  array :");
		for (int i = 0; i < length; i++) {

			num1[i] = scanner.nextInt();
		}
		practice.getUniqueNumbers(num1);
	}

	private static void findDuplicates() {

		Practice practice = new Practice();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter size of array");

		int length = scanner.nextInt();
		int[] array = new int[length];

		System.out.println("Enter the elements of the  array :");
		for (int i = 0; i < length; i++) {

			array[i] = scanner.nextInt();
		}
		List<Integer> uniqueValues = practice.findDuplicates(array);
		for (Integer value : uniqueValues) {
			System.out.println(value + " ");
		}
	}

	private static void checkSubString() {
		String s1 = "Hello World";
		String s2 = "Hello";
		System.out.println((new Practice()).findSubString(s1, s2));
	}

	private static void findNthSmallest() {
		String flag = "g";
		System.out.println("Enter the number of elemts for the array :");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] array = new int[num];
		System.out.println("Enter the elements of the array :");
		for (int i = 0; i < num; i++) {
			array[i] = scanner.nextInt();

		}
		Practice practice = new Practice();
		System.out.println("Do you want to check Nth smallest or greatest ? (G/S)");
		String response = scanner.next();
		if (response.equalsIgnoreCase("G")) {
			flag = "G";
		} else if (response.equalsIgnoreCase("s")) {
			flag = "s";
		} else
			System.err.println("Incorrect option try again");
		System.out.println("Enter the nth value");
		int n = scanner.nextInt();

		int value = practice.findNthSmallest(array, flag, n);

	}

	private static void checkPrefix() {
		String s1 = "Hello World";
		String s2 = "Hello";
		System.out.println((new Practice()).checkPrefix(s1, s2));
	}

	private static void findCommen() {
		Practice prac = new Practice();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array :");

		int length = scanner.nextInt();
		String[] array = new String[length];

		System.out.println("Enter the elements of the  array :");
		for (int i = 0; i < length; i++) {

			array[i] = scanner.next();
		}
		System.out.println("Enter size of array :");

		int len2 = scanner.nextInt();
		String[] array2 = new String[len2];

		System.out.println("Enter the elements of the  array :");
		for (int i = 0; i < len2; i++) {

			array2[i] = scanner.next();
		}
		prac.compareArrayString(array, array2);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		findNthSmallest();
	}

	private static void findDuplicate() {
		Practice prac = new Practice();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array  :");

		int length = scanner.nextInt();
		String[] array = new String[length];

		System.out.println("Enter the elements of the  array :");
		for (int i = 0; i < length; i++) {

			array[i] = scanner.next();
		}
		prac.findDuplicate(array);

	}
}
