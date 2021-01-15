package programming;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

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

	public String returnDate(int date) {

		int number = date;
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
	public int[] findDuplicate(int[] array) {
		int value = 0;
		int[] duplicate = new int[1000];

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (i == j) {
					continue;
				}

				if (array[i] == array[j]) {

					duplicate[i] = array[i];

				}
			}
		}
		return duplicate;
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
