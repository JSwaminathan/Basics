package programming.arjun;

import java.util.Scanner;

public class Range {
	public static final int MAX = 100;

	public static void main(String[] args) {
		int range;
		int size;
		int arr[] = new int[MAX];
		System.out.println("enter the number of elements for the given array");
		Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.println("enter the value for the" + i + "element");
			arr[i] = scanner.nextInt();
		}
		range = getRange(arr, size);

	}

	public static int getRange(int[] arr, int size) {
		int num1;
		int num2;
		System.out.println("Enter the range to print elements from the given array");
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		int arr1[] = new int[arr.length];
		for (int i = 0; i < size; i++) {
			if ((arr[i] >= num1 && arr[i] <= num2)) { // ||(arr[i]<=num1 && arr[i]>=num2)) {
				arr1[i] = arr[i];
				System.out.println(arr1[i]);

			}

		}
		return 0;
	}
}
