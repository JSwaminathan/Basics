package programming;

import java.util.Scanner;

public class StudentsDriver {
	public static void main(String[] args) {
		DBStudentManagementSystem db = new DBStudentManagementSystem();
		Scanner scanner = new Scanner(System.in);
		int choice;
		System.out.println("would you like to :");
		System.out.println("");
		System.out.println("1.create a new student profile");
		System.out.println("");
		System.out.println("2.update student profile ");
		System.out.println("");
		System.out.println("3. list students");
		System.out.println("");
		System.out.println("4.delete a student profile");
		System.out.println("");
		System.out.println("enter your choice");
		System.out.println("");

		choice = scanner.nextInt();
		if (choice == 1) {
			db.Createstudents();

		} else if (choice == 2) {
			db.Updatestudents();
			

		} else if (choice == 3) {
			db.listStudents();

		} else if (choice == 4) {
			db.deleteStudents();

		} else {
			System.err.println("invalid choice ");
		}

	}

}
