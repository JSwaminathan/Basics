package programming;

import java.util.Scanner;

/**
 * there will be two arrays find the minimum max and average for 2 arrays individually
 * after that find the combined minimum maximum avg 
 * @author arjun
 */



public class StudentMarks {
	
public static final int MAX = 1000 ;
	public static void main(String[] args) {
		Student[] studentMarks ;
		studentMarks = new Student[MAX];
		System.out.println ("enter the number of marks to be entered");
		Scanner scanner = new Scanner (System.in);	
		int num1 = scanner.nextInt();
		for (int i = 0 ; i < num1 ; i++) {
			studentMarks[i]= new Student ();
			System.out.println ("enter mark"+ (i+1));
			int mark = scanner.nextInt();
			studentMarks[i].setMark1(mark);
			
		}
		// to find max: first element should be set as maximum hence compare with other elements
		int max = studentMarks[0].getMark1();
 		for (int i = 1 ; i < num1 ; i++) {
			if (max < studentMarks[i].getMark1()) {
				max = studentMa][prks[i].getMark1();
				
			}
			
		}System.out.println ("the max mark is "+ max);
		int min =studentMarks[0].getMark1(); 
		for (int i = 1; i < num1; i++) {
			
			if (min > studentMarks[i].getMark1()) {
				min = studentMarks[i].getMark1();
			}
			
		}System.out.println ("the minimum mark is"+ min);
		
		float summation = 0 ;
		for (int i = 0; i < num1; i++) {
			summation = summation +studentMarks[i].getMark1();
			
		}
		float average = summation/num1 ;
		System.out.println ("average is"+ average);
		
		
		 
	}

}
