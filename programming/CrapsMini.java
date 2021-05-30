package programming;

import java.util.Random;
import java.util.Scanner;

public class CrapsMini {
	CrapsUser cu = new CrapsUser();

	public void executionhead(int bet) {
		boolean value = getWinner();
		if(value==true) {
			winmsg(bet,cu.getWinner());
			
			}else 
				play(bet);
				
	}
	public void winmsg(int bet,int dice_val){
		int additional=2*bet+300;
		System.out.println("CONGRATULATION!!! You won ");
		System.out.println("you rolled a "+dice_val);
		System.out.println("your balance now is : "+(additional+cu.getBalance()));
		cu.setBalance((additional+cu.getBalance()));
	}

	public boolean getWinner() {
		int winner = 0;
		Random random = new Random();

		int low = 1;
		int high = 7;
		 int dice1 = random.nextInt(high-low) + low;
		 int dice2=random.nextInt(high-low) + low;
		 winner =dice1+dice2;
		System.out.println("your winning slot is "+winner);
		if (winner == 7) {
			return true;

		}
		cu.setWinner(winner);

		return false;

	}
	public void play(int bet) {
		Random random = new Random();

		while(true) {
			int low = 1;
			int high = 7;
			 int dice1 = random.nextInt(high-low) + low;
			 int dice2=random.nextInt(high-low) + low;
			int  dice_val =dice1+dice2;
			if(dice_val==cu.getWinner()) {
				winmsg(bet,dice_val);
			}
			else if(dice_val==7) {
				losemsg(bet,dice_val);
				
			}
			else 
				continue;
		}
	
	}
	private void losemsg(int bet,int diceVal) {
	if(cu.getBalance()-bet<bet) {
		System.out.println(cu.getBalance() +" is all you have ");
		System.out.println("sorry you have ran out of funds!");
		System.out.println("would you like to add 1000 credits to youer account ?(YES/NO)");
		Scanner scanner = new Scanner(System.in);
		String reply=scanner.next();
		if(reply.equalsIgnoreCase("yes")||reply.equalsIgnoreCase("Y")) {
		int newBal =cu.getBalance()+1000;
		cu.setBalance(newBal);
		play(bet);
		}else if (reply.equalsIgnoreCase("NO")) {
			System.out.println("well played see you later!");
			System.exit(0);
		}else 
			System.err.println("invalid responce");
		
	}
		System.out.println("sorry you lost  rolled"+diceVal +"");
		System.out.println("your balance now is : "+(cu.getBalance()-bet));
		cu.setBalance((cu.getBalance()-bet));
		
	}
}
