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
}
