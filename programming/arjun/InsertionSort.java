package programming.arjun;

import java.util.Scanner;

public class InsertionSort {
	public static int MAX = 5;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[MAX];
		for (int i = 0; i < MAX; i++) {
			System.out.println("enter the element :");
			arr[i] = scanner.nextInt();

		}

		System.out.println("the elements of the given array :");
		int i = 0;
		while (i < arr.length) {
			System.out.println(arr[i] + "");
			i++;

		}
		
		int[] m = InsertionSort(arr);
		
		
	}
	/**
	 * in insertion sort consecutive elements should be compared if the second element is  
	 * smaller than the first unit
	 *  then the second element should become the first element..... similarly for 
		 the rest of the elements in the given array.
	 * @param arr
	 * @return
	 */
	
	public static int[] InsertionSort(int[] arr) { 
		
		
		
		
		
		return arr;

	}
}
