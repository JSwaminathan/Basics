package programming;

public class Matrix {
	private int row;
	private int col;

	private int matrix[][];

	public Matrix(int row, int col) {
		this.row = row;
		this.col = col;
		matrix = new int[row][col];
	}

	public int getValue(int row, int column) {
		return (matrix[row][column]);
	}

	public void setValue(int[][] values) {

	}

	public void setValue(int row, int column, int value) {
		matrix[row][column] = value;
	}

	public int getRowCount() {
		return (row);
	}

	public int getColCount() {
		return (col);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < getRowCount(); i++) {
			for (int j = 0; j < getColCount(); j++) {
				int val = getValue(i, j); 
				sb.append(val + " ");
				
			}
			sb.append(System.lineSeparator());
		}
		
		return (sb.toString());
	}
}
