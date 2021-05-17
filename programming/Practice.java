package programming;

import java.util.List;
import java.util.Random;
import java.util.Vector;

/**
 * @author ashwin
 *
 */
public class Practice {

	// N! = 1 * 2 * 3 * 4 * ... N
	// 5! = 1 * 2 * 3 * 4 * 5

	/**
	 * Get the factorial of the given number
	 * 
	 * @param number
	 * @return
	 */
	public int getFactorial(int number) {
		// A: Initialization
		// B: Condition
		// C: Block / body of the for loop
		// D: Increment / Decrement
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}

		return factorial;
	}

	/**
	 * this method reurns the second smallest element in an array
	 * 
	 * @param array1
	 * @return
	 */
	public int findSecondSmallestElement(int[] array1, int n) {
		int temp;
		n = n - 1;

		for (int i = 0; i < array1.length; i++) {
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] > array1[j]) {
					temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
				}
			}
		}
		// return array1[1];
		return array1[n];
	}

	/**
	 * Method subsets compares two strings. Return 0 if both Strings are identical.
	 * Return 1 if second String is a subset and begins with first String. Return 2
	 * if second String is a subset and end with first String. -1 if none of the
	 * above are true - i.e. the Strings are different.
	 * 
	 */

	public int findSubString(String mainString, String subset) {
		boolean result = checkPrefix(mainString, subset);
		boolean resultSuffix = checkSuffix(mainString, subset);
		if (mainString.length() < subset.length()) {
			return -1;
		}
		if (mainString.contentEquals(subset)) {
			return 0;
		} else if (result == true) {
			return (1);
		} else if (resultSuffix == true) {
			return 2;
		} else {
			return (-1);
		}
	}

	/**
	 * This method returns ALL the factorials for the FIRST N numbers. Example: If n
	 * == 5 Returns array of [1 2 6 24 120 ]
	 * 
	 * @param n
	 */
	public int[] getNFactorials(int n) {
		// Array is a contiguous set of values
		// Several values of "Same" type then array is the basic choice.
		// Array starts with index ZERO.

		int[] array; // declaration
		array = new int[50]; // instantiation -- with range 0 - 49

		if (n > 50) {
			System.err.println("Unable to calculate beyond 50!");
			return null;
		}

		for (int i = 1; i <= n; i++) {
			array[i - 1] = getFactorial(i);
		}

		return (array);
	}

	/**
	 * This method returns a List of tokenized elements from a given String and set
	 * of Delimiters. Example:"Port=881:Path=/home/jayaram","=:" Will return a list
	 * of Port, 881, Path, /home/jayaram
	 * 
	 * Bonus: if second parameter is null, assume the delimiter is " " (space)
	 * 
	 * @param num
	 * @return
	 */
	public List<String> tokenize(String str, String delimiters) {

		return (null);
	}

	public String returnDate(int date) {

		int digit = date % 10;
		date = date / 10;

		if (date == 0) {
			switch (digit) {
			case 1:
				return " First ";
			case 2:
				return " Second ";
			case 3:
				return " Third ";
			case 4:
				return " Fourth ";
			case 5:
				return " Fifth ";
			case 6:
				return " Sixth ";
			case 7:
				return " Seventh ";
			case 8:
				return " Eighth ";
			case 9:
				return " Nineth ";

			}
		} else if (date == 1) {
			switch (digit) {
			case 0:
				return " Tenth";
			case 1:
				return " Eleventh ";
			case 2:
				return " Twelfth ";
			case 3:
				return " Thirteenth ";
			case 4:
				return " Fourteenth ";
			case 5:
				return " Fifteen ";
			case 6:
				return " Sixteenth ";
			case 7:
				return " Seventeenth ";
			case 8:
				return " Eighteenth ";
			case 9:
				return " Nineteenth ";

			}
		} else if (date == 2) {
			switch (digit) {
			case 0:
				return "Twentieth";
			case 1:
				return " Twenty-first ";
			case 2:
				return " Twenty-second ";
			case 3:
				return " Twenty-third ";
			case 4:
				return " Twenty-fourth ";
			case 5:
				return " Twenty-fifth ";
			case 6:
				return " Twenty-sixth ";
			case 7:
				return " Twenty-seventh ";
			case 8:
				return " Twenty-eighth ";
			case 9:
				return " Twenty-nineth ";

			}
		} else {
			switch (digit) {
			case 0:
				return "Thirtieth";
			case 1:
				return " Thirty-first ";
			}
		}
		return " given date is not a part of the calender";

	}

	/**
	 * This method prints all numbers from 1 to the num passed by user.
	 * 
	 * @param num
	 */
	public void printNumbers(int num) {
		// Repeatedly perform an action.
		// For that use LOOP
		// Same code is getting executed repeatedly.

		int i = 1;
		while (i <= num) {
			System.out.println("Number: " + i);
			i++; // equivalent of i = i + 1;
		}

		System.out.println("End of loop.");
	}

	public boolean isRainbow(String color) {

		switch (color) {
		case "violet":
		case "indigo":
		case "blue":
		case "green":
		case "yellow":
		case "orange":
		case "red":
			return true;
		default:
			return false;
		}

	}

	// TODO
	// STATUS : not working :(
	public int[] getUniqueNumbers(int[] num1) {
		int[] newarray = new int[100];
		for (int i = 0; i < num1.length; i++) {
			if (i == 0) {
				newarray[i] = num1[i];
				continue;
			}
			for (int j = 2; j < num1.length; j++) {
				if (num1[i] == num1[j]) {
					continue;
				} else
					newarray[i] = num1[i];

			}

		}
		int k = 1;
		for (int n = 0; k < num1.length; n++, k++) {
			if (k == num1.length) {
				break;
			}
			if (n == k) {
				continue;
			}
			if (newarray[n] == num1[k]) {
				continue;

			}

		}
		int p = (num1.length - 1);
		for (int n = 0; n < 1; n++) {
			if (num1[(p - 1)] == num1[p]) {
				continue;
			} else {
				// System.out.println((p-1)+" value of p-1");
				newarray[p] = num1[p];
			}

		}
		for (int q = 0; q < num1.length; q++) {
			System.out.println(newarray[q]);
		}
		return newarray;
	}

	public static void findFrequency(String str, String str2) {

		{
			int i;

			int counter[] = new int[256];

			for (i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') {
					continue;
				}
				counter[(int) str.charAt(i)]++;
			}
			// Print Frequency of characters
			for (i = 0; i < 256; i++) {
				if (counter[i] != 0) {

					System.out.print((char) i + "   : has occoured " + counter[i] + "  times ");
					for (int j = 0; j < counter[i]; j++) {
						// System.out.print(" "+counter[i] );

					}
					System.out.println();

				}
			}
		}
	}

	/**
	 * this method prints a histogram of frequency of charecters
	 */

	/**
	 * returns the primes til given no
	 * 
	 * @param num
	 * @return
	 */
	public void findSumOfDistinctElements(int array[], int array2[], int num) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if ((array[i] + array2[j] )== num) {
					System.out.println(array[i]+""+array2[j]);

				}else 
					continue;

			}

		}

	}

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

		// random.ints(num, from, to).forEach( (n) -> System.out.println(n + " "));
		return ((new Random()).ints(num, from, to).toArray());
	}

	/**
	 * this method gets input of 2 arrays compares them and prints the commen
	 * elements....
	 * 
	 * @param array1
	 * @param array2
	 */
	public void compareArray(int[] array1, int[] array2) {
		int j;

		for (int i = 0; i < array1.length; i++) {
			int value = array1[i];
			for (j = 0; j < array2.length; j++) {
				if (value == array2[j]) {
					System.out.print(value + "   ");

				}
			}

		}

	}

	/**
	 * program to find duplicate elements in an array.
	 * 
	 * @param array
	 */
	/**
	 * This method returns the list of duplicate elements in the input array.
	 *
	 * @param array
	 */

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
	 * This method returns the list of duplicate elements in the input array.
	 *
	 * @param array
	 */

	public List<Integer> findDuplicates(int[] array) {
		Vector<Integer> duplicates = new Vector<Integer>();
		for (int i = 0; array != null && i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i == j) { // skip self.
					continue;
				}
				if (array[i] == array[j]) {
					if (duplicates.contains(array[i]) == false) {
						duplicates.addElement(array[i]);
					}
				}
			}
		}
		return (duplicates);

	}

	/**
	 * This method returns the reversed version of the input array.
	 *
	 * @param array
	 */
	public void reverseArray(int[] array) {
		for (int i = 0, j = array.length - 1; array != null && i < j; i++, j--) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}

	}

	/**
	 * this method is to check whether a given string starts with the contents of
	 * another string
	 */
	public boolean checkPrefix(String mainString, String prefix) {
		int len1 = mainString.length();
		int len2 = prefix.length();

		if (len2 > len1) {
			// Prefix can't be bigger than "main" string.
			return (false);
		}
		for (int i = 0; i < len2; i++) {
			if (mainString.charAt(i) != prefix.charAt(i)) {
				return (false);
			}
		}

		return true;
	}

	public boolean checkSuffix(String mainString, String suffix) {
		int len1 = mainString.length();
		int len2 = suffix.length();
		int length = suffix.length() - 1;
		if (len2 > len1) {
			// suffix can't be bigger than "main" string.
			return (false);
		}
		System.out.println("Length " + len2);

		for (int i = 0; i < len2; length--, i++) {
			if (mainString.charAt(length) != suffix.charAt(length)) {
				return (false);
			}
		}

		return true;
	}

	/**
	 * This method will get a color from a user check if it is a part of the rainbow
	 * colors.. and will return true if it is part of rainbow else false will be
	 * returns
	 * 
	 * @param color
	 * @return
	 */
	boolean checkVIBGYOR(String color) {

		if (color.equalsIgnoreCase("RED") || color.equalsIgnoreCase("ORANGE") || color.equalsIgnoreCase("YELLOW")
				|| color.equalsIgnoreCase("GREEN") || color.equalsIgnoreCase("BLUE") || color.equalsIgnoreCase("INDIGO")
				|| color.equalsIgnoreCase("VIOLET")) {
			return true;
		}

		return false;

	}

	/**
	 *  
	 */
	public void printList(int mark) {

		int i;
		for (int j = 1; j <= mark; j++) {
			for (i = 1; i <= mark; i = i + j) {
				if (i < mark) {
					System.out.print(i + "      ");
				} else {
					System.out.print(i);
				}

			}
			System.out.println("");

		}
	}

	private void returnYear(int i) {
		// TODO Auto-generated method stub

	}

	private String returnMonth(int dateFromUser, int monthFromUser) {

		switch (monthFromUser) {
		case 1:
			if (dateFromUser > 31) {
				System.err.println("there are only 31 days in january");
				System.exit(0);
			}
			return "Of January";
		case 2:
			if (dateFromUser > 28) {
				System.err.println("there are only 28 days in Febuary");
				System.exit(0);
			}
			return "Of Febuary";
		case 3:
			if (dateFromUser > 31) {
				System.err.println("there are only 31 days in March");
				System.exit(0);
			}
			return "Of March";
		case 4:
			if (dateFromUser > 30) {
				System.err.println("there are only 30 days in April");
				System.exit(0);
			}
			return "Of April";
		case 5:
			if (dateFromUser > 31) {
				System.err.println("there are only 31 days in March");
				System.exit(0);
			}
			return "Of May";
		case 6:
			if (dateFromUser > 30) {
				System.err.println("there are only 30 days in June");
				System.exit(0);
			}
			return "Of June";
		case 7:
			if (dateFromUser > 31) {
				System.err.println("there are only 31 days in July");
				System.exit(0);
			}
			return "Of July";
		case 8:
			if (dateFromUser > 31) {
				System.err.println("there are only 31 days in August");
				System.exit(0);
			}
			return "Of August";
		case 9:
			if (dateFromUser > 30) {
				System.err.println("there are only 30 days in September");
				System.exit(0);
			}
			return "Of September";
		case 10:
			if (dateFromUser > 31) {
				System.err.println("there are only 31 days in October");
				System.exit(0);
			}
			return "Of October";
		case 11:
			if (dateFromUser > 31) {
				System.err.println("there are only 30 days in November");
				System.exit(0);
			}
			return "Of November";
		case 12:
			if (dateFromUser > 31) {
				System.err.println("there are only 31 days in December");
				System.exit(0);
			}
			return "Of December";

		}
		return "there are only 12 months in a year incorrect month entered";

	}

}
