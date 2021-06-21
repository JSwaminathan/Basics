package programming.arjun;

import java.util.Scanner;

public class MinMax {
	public static final int MAX = 100;

	public static void main(String[] args) {
		int size;
		int max;
		int min;
		// to find min and max in a given array
		System.out.println("enter the number of elements for the given array");
		Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();
		int arr1[] = new int[MAX];
		int i;
		for (i = 0; i < size; i++) {
			System.out.println("enter the" + i + "element");
			arr1[i] = scanner.nextInt();
		}
		max = getMax(arr1);
		System.out.println("max is " + max);
		min = getMin(arr1);
		System.out.println("min is " + min);

	}

	public static int getMax(int[] arr1) {
		int i;
		int MaxValue;
		MaxValue = arr1[0];
		for (i = 1; i < arr1.length; i++) {
			if (arr1[i] > MaxValue) {
				MaxValue = arr1[i];
			}
		}
		return MaxValue;

	}

	public static int getMin(int[] arr1) {
		int i;
		int MinValue ;
		MinValue = arr1[0];
		for(i = 1; i<arr1.length;i++ ) {
			if (arr1[i]<MinValue) {
				MinValue = arr1[i];
			}
		
		
		
	}
		return MinValue;
		
	}
}
