package programming;

public class MatrixOperations {

	public Matrix addMatrices(Matrix m1, Matrix m2) {
		Matrix sum = new Matrix(m1.getRowCount(), m1.getColCount());
		// Go through two loops and add the individual elements using getter methods and
		// assign to sum

		// using setter.

		for (int i = 0; i < m1.getRowCount(); i++) {
			for (int j = 0; j < m1.getColCount(); j++) {
				int val = m1.getValue(i, j) + m2.getValue(i, j);
				sum.setValue(i, j, val);

			}

		}

		return (sum);
	}

	public void printMatrix(Matrix matrix) {
		int row = matrix.getRowCount();
		int col = matrix.getColCount();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix.getValue(i, j) + "  ");

			}
			System.out.println("");

		}
	}

	public Matrix subtractMatrices(Matrix m1, Matrix m2) {
		Matrix subtraction = new Matrix(m1.getRowCount(), m1.getColCount());
		// Go through two loops and add the individual elements using getter methods and
		// assign to sum
		// using setter.

		return (subtraction);
	}

}
