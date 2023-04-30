package programming;

import java.util.ArrayList;



public class Manager extends Employee {
	
	protected ArrayList<Employee> arrayList = new ArrayList<Employee>();
	
	public void addEmployee(Employee employee) {
		arrayList.add(employee);
	}
	
	public void print() {
		super.print();
		System.out.println("Managed Employees: " + arrayList);
		
	}

}
