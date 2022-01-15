package programming;

import java.util.Scanner;

public class MoveChecker {
	/**
	 * A value of 1 means a coin is present; 0 means the slot is empty.
	 */
	private Matrix board;

	public MoveChecker() {
		board = new Matrix(8, 8);
	}

	public void setPosition(int row, int col, boolean present) {
		if (row >= 8 || col >= 8) {
			throw new RuntimeException("Knight can be placed within 8X8 limit");
		}

		board.setValue(row, col, (present) ? 1 : 0);
	}

	/**
	 * Given knight's position, print all the possible places where it can move.
	 * 
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
		MoveChecker mc = new MoveChecker();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter position in Chess board to set with a coin Row : (0 - 7) : ");
			int row = scanner.nextInt();
			System.out.println("Enter position in Chess board to set with a coin Col : (0 - 7) : ");
			int col = scanner.nextInt();
			mc.setPosition(row, col, true);
			System.out.println("continue (y/n)? ");
			String value = scanner.next();
			if (value.equalsIgnoreCase("y") == false) {
				break;
			} else
				continue;
		}

		// mc.printBoardPositions();

		System.out.println("Enter position in Chess board for knight Row : (0 - 7) : ");
		int Knightrow = scanner.nextInt();
		System.out.println("Enter position in Chess board for knight Col : (0 - 7) : ");
		int Knightcol = scanner.nextInt();
		// mc.printBoardPositions();
		// mc.printKnightMovePositions(row, col);

		mc.checkPosition(Knightcol, Knightrow);

	}

	public void checkPosition(int knightcol, int knightrow) {

		for (int i = 0; i < board.getRowCount(); i++) {
			for (int j = 0; j < board.getColCount(); j++) {
				// int val = board.getValue(i, j) + board.getValue(i, j);

				if (knightcol-2>7||knightcol-2<0) {// *|
					
					if (board.getValue(knightrow - 1, knightcol + 2) == 0) {
						System.out.println("The horse can move to :" + "" + (knightrow - 1) + "," + knightcol + 2);
					}
				}

				if (board.getValue(knightrow + 1, knightcol - 2) == 0) {// |*
					System.out.println("The horse can move to :" + "" + (knightrow + 1) + "," + knightcol + 2);
				}
				if (knightcol > 0) {// |_
					if (board.getValue(knightrow - 1, knightcol + 2) == 0) {
						System.out.println("The horse can move to :" + "" + (knightrow - 1) + "," + knightcol + 2);
					}
				}
				if (knightcol > 0) {//_|
					if (board.getValue(knightrow - 1, knightcol - 2) == 0) {
						System.out.println("The horse can move to :" + "" + (knightrow - 1) + "," + knightcol + 2);
					}
				}

				else if (knightcol >= 6) {

				}

			}

		}
	}
}
