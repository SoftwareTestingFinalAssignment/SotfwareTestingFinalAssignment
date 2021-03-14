package calculator;


public class Matrix {
    private final double [][] matrix;
    private final int row;
    private final int column;

    public Matrix(int row, int column){
        this.row = row;
        this.column = column;
        matrix = new double[row][column];
    }

    public Matrix (double[][] matrix){
        this.matrix = matrix;
        row = matrix.length;
        column = matrix[0].length;
    }

    public int getColumn() {
        return column;
    }

    public double getValue ( int row, int column ){
        return matrix[row][column];
    }

    public double[][] setValue (int row, int column, double value ){
        matrix[row][column] = value;
        return matrix;
    }

    @Override
    public String toString() {
        StringBuilder array_tostring = new StringBuilder();
        for (int i = 0; i < row; i++) {
            array_tostring.append("[ ");
            for (int j = 0; j < column; j++ ){
                if (j < column-1)
                    array_tostring.append(matrix[i][j]).append(", ");
                else array_tostring.append(matrix[i][j]);
            }
            array_tostring.append(" ]");
        }
        return "[ " + array_tostring + " ]";
    }
}
