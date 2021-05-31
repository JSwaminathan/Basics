package com.jaa.schoolmgmt;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class StudentsClass {
	Hashtable<String, Student> students;
	
	public StudentsClass() {
		students = new Hashtable<String, Student>(); 
	}

	public void addStudent(Student student) {
		String id =  student.getId() ;
		students.put(id, student);
	}
	
	public Student getStudent(String id) {
		return (students.get(id));  
		
	}
	
	public void printStudents() {
		
		
		for (Enumeration<String> keys = students.keys(); keys.hasMoreElements(); ) {
			String elem = keys.nextElement();
			System.out.println("Key: " + elem);
			Student student = students.get(elem);
			String ID = student.getId();
			String name = student.getName();
			String phone = student.getPhone();
			
			System.out.println("Student with ID " + ID + " is " + name + " phone " + phone);
			
		}
	}
	
	public static void main(String[] args) {
		StudentsClass sc = new  StudentsClass();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter ID: ");
			String id = scanner.next();
			System.out.println("Enter Name: ");
			String name = scanner.next();	
			System.out.println("Enter Phone: ");
			String phone = scanner.next();	
			
			Student student = new Student();
			student.setId(id);
			student.setName(name);
			student.setPhone(phone);
			
			sc.addStudent(student);
		}
		
		sc.printStudents();
//		while (true) {
//			System.out.println("Enter student ID to search: ");
//			String id = scanner.next();
//			Student student = sc.getStudent(id);
//			
//			String ID = student.getId();
//			String name = student.getName();
//			String phone = student.getPhone();
//			
//			System.out.println("Student with ID " + ID + " is " + name + " phone " + phone);
//		}

	}

}
