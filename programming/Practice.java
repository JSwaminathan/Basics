package programming;

import java.util.Random;
import java.util.Scanner;

/**
 * @author ashwin
 *
 */
public class Practice {

	public int getFactorial(int num) {
		int fac = 1;
		for (int i = 1; i <= num; i++) {
			fac = fac * i;
		}
		return fac;

	}

	/**
	 * returns the primes til given no
	 * 
	 * @param num
	 * @return
	 */
	public int[] getPrimes(int num) {
		int[] primes = new int[1000];
		int count = 0;
		for (int i = 2; i <= num; i++) {
			boolean flag = true;
			for (int j = 2; j < 10; j++) {
				if (i / j == 0) {
					flag = false;
					break;
				}
			}

			if (flag == true) {
				primes[count] = i;
				count++;
			}
		}

		return primes;

	}

	/**
	 * returns an array of random numbers ranging from the given range from is
	 * inclusive while to is exclusive.......
	 * 
	 * @param num
	 * @return
	 */
	public int[] getRandomNumbers(int num, int from, int to) {

		// random.ints(num, from, to).forEach( (n)  ->  System.out.println(n + " "));
		return ((new Random()).ints(num, from, to).toArray());
	}

	/**
	 * to reverse string1 and if matches with string2 then return True else
	 * false......
	 */
	public boolean reverseCompare(String string1, String string2) {
		// for example str1 = hello and str2 = ol
		if (string1.length() != string2.length()) {

			return false;
		}
		int index = string1.length() - 1;
		for (int i = 0; i < string2.length(); i++) {
			if (string1.charAt(index) == string2.charAt(i)) {
				index--;
				continue;
			} else {
				return false;
			}

		}
		return true;

	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Practice practice = new Practice();
		
		int[] rnums = practice.getRandomNumbers(5, 100, 999);
		
		for(int i : rnums) {
			System.out.println("Random: " + i);
		}
		

	}

}
