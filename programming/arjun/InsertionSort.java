package programming.arjun;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("enter number of elements");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println("enter the element :");
			arr[i] = scanner.nextInt();

		}

		int[] newArray = Sorter(arr);

		for (int k = 0; k < arr.length; k++) {
			System.out.println(newArray[k]);
		}

	}

	/**
	 * in insertion sort consecutive elements should be compared if the second
	 * element is smaller than the first unit then the second element should become
	 * the first element..... similarly for the rest of the elements in the given
	 * array.
	 * 
	 * @param arr
	 * @return
	 */

	public static int[] Sorter(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (i == j) {
					continue;
				}

				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}

		return arr;

	}
}
