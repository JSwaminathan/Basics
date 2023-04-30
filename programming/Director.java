package programming;

public class Director extends Manager {
	int deptID;

	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}
	
	public void print() {
		super.print();
		System.out.println("Department: " + deptID);
		
	}

}
