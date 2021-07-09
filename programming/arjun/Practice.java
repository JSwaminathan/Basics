package programming.arjun;

import java.util.Scanner;

public class Practice {
	public int getMin(int a, int b) {
		return (a > b) ? a : b;
	}

	/**
	 * Return ALL the elements given in the range.
	 * 
	 * @param arr
	 * @param size
	 * @return
	 */
	public int[] getRange(int[] arr, int size, int lbound, int ubound) {
		int count = 0;
		int arr1[] = new int[arr.length];
		for (int i = 0; i < size; i++) {
			if ((arr[i] >= lbound && arr[i] <= ubound)) {
				arr1[count] = arr[i];
				count++;
			}

		}
		return arr1;
	}

	public static int[] getFrequency(int arr[], int size) {
		
		int frequency[] = new int[size];
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (i == j)
					continue;

				else if (arr[i] == arr[j]) {
					frequency[i] = arr[j];

				}

			}
		}
		return frequency;

	}
	
	public int getMax(int[] arr1) {

		int maxValue = arr1[0];

		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] > maxValue) {
				maxValue = arr1[i];
			}
		}
		return maxValue;

	}

	public int getMin(int[] arr1) {

		int minValue = arr1[0];

		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] < minValue) {
				minValue = arr1[i];
			}
		}
		return minValue;
	}
}