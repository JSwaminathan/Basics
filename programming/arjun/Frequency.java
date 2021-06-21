package programming.arjun;

import java.util.Scanner;

public class Frequency {
	public static final int MAX = 100;

	public static void main(String[] args) {
		int size;
		int arr[] = new int[MAX];
		System.out.println("enter the number of elements for the given array");
		Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.println("enter the value for the" + i + "element");
			arr[i] = scanner.nextInt();
		}
		int[] frequency;
		frequency = getFrequency(arr, size);
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] != 0) {
				System.out.println("the duplicates are " + frequency[i]);
			}

		}

	}

	public static int[] getFrequency(int arr[], int size) {
		int i;
		int j;
		int count = 1;
		int frequency[] = new int[size];
		for (i = 0; i < size; i++) {
			for (j = i + 1; j < size; j++) {
				if (i == j)
					continue;

				else if (arr[i] == arr[j]) {
					count++;
					frequency[i] = arr[j];

				}

			}
		}
		return frequency;

	}

}
