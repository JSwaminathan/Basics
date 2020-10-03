package com.jaa.schoolmgmt;

/**
 * Student
 */
public class Student {
	private String id;
	private String name;
	private String email;
	private String phone;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String toString() {
		return (
				"ID " + id + " ; Name: " + name + " ; " +
				"Email " + email + " ; Phone: " + phone 
			);
	}
}
