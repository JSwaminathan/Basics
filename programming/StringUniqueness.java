package programming;

import java.util.Scanner;

public class StringUniqueness {
	protected static int[] count;
	static {
		count = new int[26];
		for(int i = 0; i < 26; i++) {
			count[i] = 0;
		}
	}

	protected static void countAlphabets(String  str) {
		int size = str.length();
		for (int i = 0; i < size; i++) {
			int val = str.charAt(i) - 'a';
			if (val < 0 || val > 25)
					continue;
			count[val]++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String: ");
		Scanner scanner = new Scanner(System.in);
		String mystr = scanner.next();
		
		countAlphabets(mystr);
		
		for (int i = 0; i < count.length; i++) {
			if (count[i] > 1) {
				System.out.println("Chars are not unique");
				return;
			}
		}
		System.out.println("Chars are unique.");
	}

}
