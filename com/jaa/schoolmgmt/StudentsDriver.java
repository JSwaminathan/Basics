package com.jaa.schoolmgmt;

import java.util.List;
import java.util.Scanner;

import com.jaa.schoolmgmt.db.DBStudentManagementSystem;

public class StudentsDriver {
	public static void main(String[] args) {

		DBStudentManagementSystem db = new DBStudentManagementSystem();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int choice;

		while (true) {
			showMenu();

			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				db.createStudent();
				break;
			case 2:
				db.updateStudent();
				break;
			case 3:
				printStudents();
				break;
			case 4:
				db.deleteStudent();
				break;
			case 5:
				System.out.println("Exiting Student Management System.");
				System.exit(0);
				break;
			default:
				System.err.println("invalid choice ");

			}

		}
	}

	private static void printStudents() {
		DBStudentManagementSystem db = new DBStudentManagementSystem();
		List<Student> students = db.getAllStudents();
		
		for (Student student : students) {
			System.out.println("Student: " + student);
		}
	}

	public static void showMenu() {
		System.out.println("Welcome to Student Management System.");
		System.out.println("Would you like to :");
		System.out.println("");
		System.out.println("1.create a new student profile");
		System.out.println("");
		System.out.println("2.update student profile ");
		System.out.println("");
		System.out.println("3. list students");
		System.out.println("");
		System.out.println("4.delete a student profile");
		System.out.println("");
		System.out.println("5.eXit");
		System.out.println("");
		System.out.print("Enter your choice: ");
	}

}
