package programming;
import java.util.List;
import java.util.Scanner;
public class CrapsDriver {
	public static final int balance = 10000;
	
	public static void main(String[] args) {
		CrapsUser cu = new CrapsUser();
		CrapsMini craps = new CrapsMini();
	System.out.print("");
	System.out.print("");
	System.out.print("");
	System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("									WELCOME TO CRAPS MINI ");
	System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("");
	System.out.println(" Enter bet value");
	Scanner scanner = new Scanner(System.in);
	int bet = scanner.nextInt();
	if(bet>balance) {
		System.out.println("Sorry not enough funds");
		System.exit(0);
	}
	cu.setBalance(balance);
	craps.executionhead(bet);
	
}
}
