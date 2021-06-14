package programming;

import java.util.Scanner;

public class TrainDriver {
/**
 * this class accepts a source and a destionation of a traveler 
 *  and returns the train to be caught to reqach the destination
 * @param args
 */
	public static void main(String[] args) {
		TrainObject to = new TrainObject();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter departure ");
		String departure =scanner.next();
		to.setSource(departure);
		System.out.println("enter the destination");
		String arrival =scanner.next();
		to.setDestination(arrival);

	}

}
