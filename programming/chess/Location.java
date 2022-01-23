package programming.chess;

public class Location {
	protected int row;
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

	protected int col;
	
	public String toString() {
		return ("Row: " + row + " Col: " + col);
	}
}
