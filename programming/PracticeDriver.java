/**
 * 
 */
package programming;

import java.util.List;
import java.util.Random;
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
	private static int[] returnNewArray() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter size of array  :");

		int length = scanner.nextInt();
		int[] num1 = new int[length];

		System.out.println("Enter the elements of the  array :");
		for (int i = 0; i < length; i++) {

			num1[i] = scanner.nextInt();
		}
		
	
		return num1;
	}
	private static void findSumOfDistinctElements() {
		Scanner scanner =new Scanner(System.in);
		Practice prac =new Practice();
		int array[]=null;
		int array2[]=null;
		 array=returnNewArray();
		 array2 = returnNewArray();
		 System.out.println("enter the number for elemets to be equal");
		 int num=scanner.nextInt();
		prac.findSumOfDistinctElements(array,array2,num);
		
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
		int n=0;
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
		
		int element =practice.findSecondSmallestElement(array1,n);
		 System.out.println(" second smallest element present in given array: " + element); 
	}

	public static void findFrequency() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = scanner.nextLine();
		System.out.println("enter the second string ");
		String str2=scanner.nextLine();
		
		
		System.out.print("");
		System.out.print("");
		System.out.print("");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("						HISTOGRAM OF FREQUENCY OF CHARECTERS IN A SENTENCE ");
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(" ");

		Practice.findFrequency(str,str2);
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
	

	private static void checkPrefix() {
		String s1 = "Hello World";
		String s2 = "Hello";
		System.out.println((new Practice()).checkPrefix(s1, s2));
	}
	private static void findCommen() {
		Practice prac =new Practice();
		Scanner scanner =new Scanner(System.in);
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
		findCommen();
	}
	private static void findDuplicate() {
		Practice prac =new Practice();
		Scanner scanner =new Scanner(System.in);
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
