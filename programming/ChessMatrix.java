package programming;

public class ChessMatrix {
	private int row;
	private int col;

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int[][] Matrix(int row, int col) {
		this.row = row;
		this.col = col;
		matrix = new int[row][col];
		return (matrix);
	}

	public int getValue(int row, int column) {
		return (matrix[row][column]);
	}

	public void setValue(int[][] values) {

	}

	public void setValue(int row, int column, int value) {
		matrix[row][column] = value;
	}

	private int matrix[][] = new int[row][col];

}
