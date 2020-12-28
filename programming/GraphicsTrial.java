package programming;

import java.applet.*;
/** 
 * How To Play:
 * select any no.of slots you want(each slot costs $100) between 1-36  * the computer randomly chooses 1 slot out of the 36 slots  
 * if the slot chosen by you and the computer are the same then you win 35 times your bet amount 
 * but if you lose you will be losing all the money you bet in that round  * note :each slot is $100 if you bet in 5 slots and win in 1 of the slots you  will still lose the money you kept on the ther slots  
 * so 4 slots *$100(value of each slot)=$400  
 * you will lose $400. 
 * and you will will win 100(bet amount) slot*35(value of one win)=3500  * so after what you have lost you will have 3100 (3500-400)  *  
 * BEST OF LUCK!!  
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GraphicsTrial extends Applet implements ActionListener {
	/**
	 * applet removed :(
	 */
	public final int BET_AMOUNT = 100;// value of each slot.
	int roll;
	Button[] btns = new Button[37];
	TextField balance = new TextField();
	Label status = new Label();
	Panel northPanel = new Panel();
	User user;
	int slotsSelected;
	int[] selectedNums;

	public void actionPerformed(ActionEvent e) {
		Button btn = (Button) e.getSource();
		if (btn.getActionCommand().equalsIgnoreCase("Reset")) {
			reset();
			return;
		}
		if (btn.getActionCommand().equalsIgnoreCase("Load")) {
			load();
			return;
		}
		if (btn.getActionCommand().equalsIgnoreCase("Play")) {
			play(e);
			return;
		}
		buttonsAction(btn);
	}

	private void buttonsAction(Button btn) {
		btn.setBackground(Color.GREEN);
		btn.setForeground(Color.BLACK);
		String str = btn.getActionCommand();
		int slot = Integer.parseInt(str);
		selectedNums[slotsSelected++] = slot;
	}

	public void load() {
		int b = user.getBalance();
		b = b + 1000;
		user.setBalance(b);
		balance.setText(Integer.toString(b));
	}

	public void reset() {
		// odd =red even =black .
		for (int i = 1; i <= 36; i++) {
			Button btn = btns[i];
			if (i % 2 != 0) { // Odd, so keep RED, else keep black. btn.setBackground(Color.RED);
			} else {
				btn.setBackground(Color.BLACK);
			}
			btn.setForeground(Color.WHITE);
		}
		slotsSelected = 0;
	}

	private boolean checkFunds() {
		int balance = user.getBalance();
		if (balance == 0) {
			System.err.println("sorry no funds please top up. ");
			return (false);
		}
		int betAmount = slotsSelected * BET_AMOUNT;
		if (betAmount > user.getBalance()) {
			return (false);
		} else {
			return (true);
		}
	}

	public void play(ActionEvent e) {
		if (slotsSelected == 0) {
			System.err.println("No selection done!");
			return;
		}
		// Check if the user has sufficient funds.
		if (checkFunds() == false) {
			setStatus("Insufficient balance");
			return;
		}
//to reset the previous roll (computer). 
		if (roll != 0) {
			// if we start the run for the first time roll 0 thus we do not want to execute
			// the condition.
			Button btn = btns[roll];
			int check = roll % 2;
			if (check != 0) {
				btn.setBackground(Color.RED);
			} else {
				btn.setBackground(Color.BLACK);
			}
			btn.setForeground(Color.WHITE);
		}
		Random random = new Random();
		roll = (random.nextInt(37) % 36) + 1;
		boolean flag = false;
		// the roll will be highlighted in orange.
		Button btn = btns[roll];
		btn.setBackground(Color.ORANGE);
		btn.setForeground(Color.BLACK);
		for (int i = 0; i < slotsSelected; i++) {
			if (selectedNums[i] == roll) {
				System.out.println("the roll was : " + roll);
				int balance = user.getBalance();
				balance = balance + (BET_AMOUNT * 35);
				user.setBalance(balance);
				flag = true;
			} else {
				int balance = user.getBalance();
				balance = balance - BET_AMOUNT;
				user.setBalance(balance);
			}
		}
		if (flag == false) {
			// lost.
			setStatus("You Lost this round!!");
		} else {
			// victory .
			setStatus("You WON this round ");
		}
		int bal = user.getBalance();
		balance.setText(Integer.toString(bal));
	}

	public void setStatus(String str) {
		status.setFont(new Font("Serif", Font.BOLD, 35));
		status.setText(" " + str);
		// northPanel.repaint();
		repaint();
	}

	public void init() {
		user = new User();
		selectedNums = new int[37];
		setLayout(new BorderLayout());
		setBackground(Color.BLUE);
		setSize(950, 450);
		Panel panel = new Panel();
		panel.setLayout(new GridLayout(6, 6, 5, 5));
		for (int i = 1; i <= 36; i++) {
			Button btn = new Button(Integer.toString(i));
			btn.setActionCommand(Integer.toString(i));
			btn.addActionListener(this);
			btns[i] = btn;
			panel.add(btn);
		}
		add(panel, BorderLayout.CENTER);
		Panel southPanel = new Panel();
		Button load = new Button("Load");
		load.setFont(new Font("Serif", Font.BOLD, 40));
		load.setActionCommand("load");
		southPanel.add(load);
		load.addActionListener(this);
		Button play = new Button("Play");
		play.setFont(new Font("Serif", Font.BOLD, 40));
		play.setActionCommand("play");
		southPanel.add(play);
		play.addActionListener(this);
		Button reset = new Button("Reset");
		reset.setActionCommand("reset");
		reset.addActionListener(this);
		reset.setFont(new Font("Serif", Font.BOLD, 40));
		southPanel.add(reset);
		reset();
		add(southPanel, BorderLayout.SOUTH);
		Label balanceLabel = new Label("Balance");
		balanceLabel.setFont(new Font("Serif", Font.BOLD, 35));
		balanceLabel.setForeground(Color.WHITE);
		northPanel.add(balanceLabel);
		add(northPanel, BorderLayout.NORTH);
		int bal = user.getBalance();
		balance.setText(Integer.toString(bal));
		balance.setFont(new Font("Serif", Font.BOLD, 35));
		balance.setEditable(false);
		northPanel.setLayout(new GridLayout());
		northPanel.add(balance);
		northPanel.add(status);
		setStatus("Good luck!!");
	}
}
