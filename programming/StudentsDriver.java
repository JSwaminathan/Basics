package programming;

import java.util.Scanner;

public class StudentsDriver {
	public static void main(String[] args) {
		DBStudentManagementSystem db = new DBStudentManagementSystem();
		Scanner scanner = new Scanner(System.in);
		int choice;

		while (true) {
			showMenu();

			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				db.Createstudents();
				break;
			case 2:
				db.Updatestudents();
				break;
			case 3:
				db.listStudents();
				break;
			case 4:
				db.deleteStudents();
				break;
			case 5:
				System.out.println("Exiting Student Management System.");
			default:
				System.err.println("invalid choice ");

			}

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
		System.out.println("Enter your choice: ");
		System.out.println("");
	}

}
