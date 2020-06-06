package programming;

import java.util.Scanner;

public class Anagram {

	public boolean isPallindrome(String str1, String str2) {
		
		int len1 = str1.length();
		int len2 = str2.length();
		
		for (int i = 0, j = len2 - 1; i < len1 && j >= 0; i++, j--) {
			if (str1.charAt(i) != str2.charAt(j)) {
				return (false);
			}
		}
		return (true);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String1: ");
		String str1 = scanner.next();

		System.out.println("Enter String2: ");
		String str2 = scanner.next();
		
		Anagram anagram = new Anagram();
		if (anagram.isPallindrome(str1, str2)) {
			System.out.println("The strings are Pallindromes!");
		} else {
			System.out.println("The strings are NOT Pallindromes!");
		}
	}

}
