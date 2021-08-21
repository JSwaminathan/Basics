package programming;

import java.util.Scanner;

public class ChessMoveChecker {
	/**
	 *  A value of 1 means a coin is present; 0 means the slot is empty.
	 */
	private Matrix board;
	
	public ChessMoveChecker() {
		board = new Matrix(8, 8);
	}
	
	public void setPosition(int row, int col, boolean present)
	{
		if (row >= 8 || col >= 8 ) {
			throw new RuntimeException("Illegal position");
		}
		
		board.setValue(row, col, (present)? 1 : 0);
	}
	
	/**
	 * Given knight's position, print all the possible places where it can move.
	 * @param row
	 * @param col
	 */
	public void printKnightMovePositions(int row, int col) {
		
	}
	
	public void printBoardPositions() {
		System.out.println("Board Positions: ");
		System.out.println(board.toString());
	}
	
	public static void main(String[] args) {
		ChessMoveChecker cmc = new ChessMoveChecker();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter position in Chess board to set with a coin Row : (0 - 7) : ");
			int row = scanner.nextInt();
			System.out.println("Enter position in Chess board to set with a coin Col : (0 - 7) : ");
			int col = scanner.nextInt();
			cmc.setPosition(row, col, true);
			System.out.println("continue (y/n? ");
			String value = scanner.next();
			if (value.equalsIgnoreCase("y") == false) {
				break;
			}
		}
		
		cmc.printBoardPositions();
		
		System.out.println("Enter position in Chess board for knight Row : (0 - 7) : ");
		int row = scanner.nextInt();
		System.out.println("Enter position in Chess board for knight Col : (0 - 7) : ");
		int col = scanner.nextInt();
		
		cmc.printKnightMovePositions(row, col);
		
		scanner.close();
		
	}
}
