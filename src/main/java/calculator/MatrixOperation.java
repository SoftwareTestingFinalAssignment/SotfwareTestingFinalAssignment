package calculator;

public class MatrixOperation{
    private Matrix matrix;
    private int row;
    private int column;

    public MatrixOperation(int row, int column){
        matrix = new Matrix(row, column);
    }


    public static Matrix copy (Matrix matrix) {
        int row = matrix.getRow();
        int column = matrix.getColumn();
        Matrix matrix_result = new Matrix(row, column);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++ ){
                matrix_result.setValue(i, j, matrix.getValue(row, column));
            }
        }
        return matrix_result;
    }


    public int getValue ( int row, int column ){
        return matrix.getValue(row, column);
    }

    public Matrix setValue (int row, int column, int value ){
        Matrix matrix_result = new Matrix(matrix.setValue(row, column, value));
        return matrix_result;
    }

    public int getColumn() {
        return matrix.getColumn();
    }

    public int getRow() {
        return matrix.getColumn();
    }

    @Override
    public String toString() {
        return matrix.toString();
    }
}