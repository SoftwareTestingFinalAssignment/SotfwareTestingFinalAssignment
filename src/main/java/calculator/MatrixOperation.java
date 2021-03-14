package calculator;

public class MatrixOperation{
    private Matrix matrix;

    public MatrixOperation(int row, int column){
        matrix = new Matrix(row, column);
    }

    public double getValue ( int row, int column ){
        return matrix.getValue(row, column);
    }

    public Matrix setValue (int row, int column, double value ){
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
