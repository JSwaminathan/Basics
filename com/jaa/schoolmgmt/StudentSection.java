package com.jaa.schoolmgmt;

import java.util.Scanner;

/**
 * This class represents a class or a section in a school with students.
 * The student class is a representation of a student with specific attributes such as
 * name, email etc and also marks.
 * @author jayaram
 *
 */
public class StudentSection {
	enum Subject {ENGLISH, MATHS, CS }
	
	Student[] students;
	
	public int findMax(Subject subject) {
		
		return 0;
	}
	
	public int findMin(Subject subject) {
		return 0;
	}
	
	public float findAvg(Subject subject) {
		return 0;
	}
	
	public void getMarks() {
		System.out.println("Enter the class strength: ");
	
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		students = new Student[count]; 
		
		for (int i = 0; i < count; i++) {
			getStudentDetails(students[i], scanner);
		}
		
	}
	
	private void getStudentDetails(Student student, Scanner scanner) {
		System.out.println("Enter Name: ");
		String name = scanner.next();
		
		System.out.println("Enter Email: ");
		String email = scanner.next();
		
		System.out.println("Enter English Marks: ");
		int english = scanner.nextInt();
		
		System.out.println("Enter Maths Marks: ");
		int maths = scanner.nextInt();
		
		System.out.println("Enter CS Marks: ");
		int cs = scanner.nextInt();
		
		student.setName(name);
		student.setEmail(email);
		student.setEngMarks(english);
		student.setMathMarks(maths);
		student.setCsMarks(cs);
				
	}

	public void printReport() {
		int engMin   = findMin(Subject.ENGLISH);
		int engMax   = findMax(Subject.ENGLISH);
		float engAvg = findAvg(Subject.ENGLISH);
		
		System.out.println("Subject: English");
		System.out.println("Minimum: " + engMin + " :: Maximum: " + engMax + " :: Average: " + engAvg);
		
		int mathsMin   = findMin(Subject.MATHS);
		int mathsMax   = findMax(Subject.MATHS);
		float mathsAvg = findAvg(Subject.MATHS);
		
		System.out.println("Subject: Maths");
		System.out.println("Minimum: " + mathsMin + " :: Maximum: " + mathsMax + " :: Average: " + mathsAvg);
		
		int csMin   = findMin(Subject.CS);
		int csMax   = findMax(Subject.CS);
		float csAvg = findAvg(Subject.CS);
		
		System.out.println("Subject: ComputerScience");
		System.out.println("Minimum: " + csMin + " :: Maximum: " + csMax + " :: Average: " + csAvg);

	}
	
	public static void main(String[] args) {
		
		StudentSection section;
		
		section = new StudentSection();
		
		section.getMarks();
		section.printReport();
	}

}
