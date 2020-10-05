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
				createStudent();
				break;
			case 2:
				updateStudent();
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

	private static void updateStudent() {
		DBStudentManagementSystem db = new DBStudentManagementSystem();

		System.out.println("Enter ID for updation: ");
		Student student = new Student();
		Scanner scanner = new Scanner(System.in);
		String id = scanner.next();
		student.setId(id);
		
		// TODO check ID exists, before trying to update.
		
		System.out.println("Enter Name for updation: ");
		String name = scanner.next();
		student.setName(name);
		
		System.out.println("Enter Email for updation: ");
		String email = scanner.next();
		student.setEmail(email);
		
		System.out.println("Enter Phone for updation: ");
		String phone = scanner.next();
		student.setPhone(phone);
		
		db.updateStudent(student);
		System.out.println("Student: " + student);

	}
	private static void createStudent() {
		DBStudentManagementSystem db = new DBStudentManagementSystem();

		System.out.println("Enter new id to create profile: ");
		Student student = new Student();
		Scanner scanner = new Scanner(System.in);
		String id = scanner.next();
		student.setId(id);
		
		// TODO check ID exists, before trying to update.
		
		System.out.println("Enter Name : ");
		String name = scanner.next();
		student.setName(name);
		
		System.out.println("Enter Email : ");
		String email = scanner.next();
		student.setEmail(email);
		
		System.out.println("Enter Phone : ");
		String phone = scanner.next();
		student.setPhone(phone);
		
		db.updateStudent(student);
		System.out.println("Student: " + student);

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
