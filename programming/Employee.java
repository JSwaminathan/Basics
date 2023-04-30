package programming;

public  class Employee {
	protected String phoneNumber;
	protected String name;
	protected String emailID;
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmailID() {
		return emailID;
	}
	
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	public void print() {
		System.out.println("Name: "+name);
		System.out.println("EmailID: "+emailID);
		System.out.println("PhoneNumber: "+phoneNumber);
		
	}
	public String toString() {
		return "Name: " + name + " Phone: " + phoneNumber + " Email: " + emailID;
		
		
	}
	
}
