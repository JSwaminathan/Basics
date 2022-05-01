package programming.resourcemgmt.railways;

import java.util.Scanner;

import programming.resourcemgmt.*;

public class RailwaysDriver {
	public static final int ABSOLUTE_LIMIT = 10; // Max seats per coach.
	public static final int INDIVIDUAL_LIMIT = 6; // Max seats a user can book
	
	public static final int TOTAL_COACHES = 10;
	
	public static final String COACH = "coach";
	
	ReservationManager manager;
	ResourceList list;
	
	public RailwaysDriver() {
		manager = new ReservationManager();
		
		// Create the coaches for a train.
		createCoaches();
		
		manager.setResourceList(list);
	}
	
	private void createCoaches() {
		list = new ResourceList();
		for (int i = 1; i <= TOTAL_COACHES; i++) {
			list.createResource(COACH+i, ABSOLUTE_LIMIT, INDIVIDUAL_LIMIT);
		}
		
	}
	
	public int reserve(String name, int num) {
		return (manager.reserve(name, null, num));
	}
	
	public ReservationManager getResourceManager() {
	    return (manager);	
	}
	
	public static void main(String[] args) {
		
		RailwaysDriver driver = new RailwaysDriver();
		ReservationManager manager = driver.getResourceManager();
		
		while (true) {
			System.out.println("Reserve , Cancel, Quit (R,C,Q)? ");
			Scanner scanner = new Scanner(System.in);
			String choice = scanner.next();
			
			if (choice.equalsIgnoreCase("Q")) {
				System.exit(0);
			} else 
				if (choice.equalsIgnoreCase("R")) {
					String coach;
					try {
						System.out.println("Enter coach: ");
						coach = scanner.next();
						System.out.println("Enter # of tickets: ");
						int units = scanner.nextInt();
						
						manager.reserve(coach, null, units);
						manager.printResourceCurrentState(coach);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.err.println(e.getMessage());
					}
					
				} else
					if (choice.equalsIgnoreCase("C")) {
						System.out.println("Enter Coach:");
						String coach = scanner.next();
						System.out.println("Enter confirmation # ");
						int confirmationNumber = scanner.nextInt();
						manager.cancel(coach, confirmationNumber);
						manager.printResourceCurrentState(coach);
					}
					else {
						System.err.println("Wrong choice!");
					}
				
		}
		
	}
	

}
