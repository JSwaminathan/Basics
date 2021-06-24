package programming.arjun;

import java.util.Scanner;

public class StringCompare {
public static void main(String[]args) {
	int length ;
	String word =null;
	String[] letters = new String[32];
	System.out.println("enter the words");
	Scanner scanner = new Scanner (System.in);
	int i;
	for(i=1;i<=3;i++) {
		word = scanner.next();
	}
	System.out.println("enter the length of the character array");
	length = scanner.nextInt();
	for(int j=0;j<length;j++) {
		letters[i]=scanner.next();
		
	}
	String StringCompare;
	StringCompare = getStringCompare(word,letters) ;
	System.out.println(StringCompare);
}
public static String getStringCompare(String word ,String[]letters) {
	int i;
	int arr1[]= new int [letters.length];
	for(i=0;i<letters.length;i++) {
		word = =letters[i];
			
		}
	}
	
	
	return word;
	
}
}
