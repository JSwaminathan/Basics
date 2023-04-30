package programming;

import java.util.ArrayList;

public class EmployeePractice {
	public static void main(String[] args) {
		
	 ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e1 = new Employee();
		e1.setEmailID("ashwin@gmail");
		e1.setName("Ashwin");
		e1.setPhoneNumber("89393");
		
		Manager e2 = new Manager();
		e2.setEmailID("jay@gmail");
		e2.setName("Jayaram");
		e2.setPhoneNumber("97898");
		
		e2.addEmployee(e1);
		
		Director e3 = new Director();
		e3.setEmailID("arjun@gmail");
		e3.setName("Arjun");
		e3.setPhoneNumber("98849");
		e3.setDeptID(165);
		e3.addEmployee(e2);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		printEmployees(al);
		
	}

	private static void printEmployees(ArrayList<Employee> al) {
		for(Employee e : al ) {
			e.print();
		}
	}

}
