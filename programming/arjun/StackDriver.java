package programming.arjun;
import java.util.Scanner;




public class StackDriver {
	
	 MultipleStack ms;
	 
	StackDriver (){
		 ms=new MultipleStack();
	}
	private void driveOptions(Scanner scanner, String option) {
		
		if (option.equalsIgnoreCase("1")) {
			System.out.println("enter the the name to be inserted into the stack");
			String name = scanner.next();
			ms.push(name);
			
		} else if (option.equalsIgnoreCase("2")) {
		String value =	ms.pop();
		System.out.println("removed name is"+ value);

		} else if (option.equalsIgnoreCase("3")) {
			ms.peak();
			
		} else if (option.equalsIgnoreCase("4")) {
			
			System.exit(0);

		
		} else {
			System.err.println("invalid option");
		}
	}

	public String printOptions(Scanner scanner) {
		System.out.println("select from menu ->");
		System.out.println("1. push into stack");
		System.out.println("2. pop ");
		System.out.println("3. peak ");
		System.out.println("4. Exit");
		String reply = scanner.next();
		return reply;
	}
	public static void main(String[] args) {
		StackDriver driver = new StackDriver ();
		Scanner scanner = new Scanner(System.in);
		while(true) {
		String reply =driver.printOptions(scanner);
		driver.driveOptions(scanner, reply);
		}
		
		

	}

	
}
