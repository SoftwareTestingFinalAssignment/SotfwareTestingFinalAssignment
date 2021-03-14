package calculator;

public class Calculator {
    public double add (double n1, double n2){
        return n1+n2;
    }

    public double subtract(double n1, double n2){
        return n1-n2;
    }

    public double multiply (double n1, double n2){
        return n1*n2;
    }

    public double divide (double n1, double n2){
        return n1/n2;
    }

    public MatrixOperation add (MatrixOperation m1, MatrixOperation m2 ){

        // Variable declaration
        int m1_row = m1.getRow();
        int m1_column = m1.getColumn();
        int m2_row = m2.getRow();
        int m2_column = m2.getColumn();

        MatrixOperation result_matrix = new MatrixOperation(m1_row, m1_column);
        double result_value;

        // Iterate the matrix to assign the values of the add
        // just if both matrix have the same size
        if ( m1_row == m2_row && m1_column == m2_column ) {
            for (int i = 0; i < m1_row; i++) {
                for (int j = 0; j < m1_column; j++){
                    result_value = add(m1.getValue( i, j ), m2.getValue( i, j));
                    result_matrix.setValue( i, j, result_value);
                }
            }
            return result_matrix;
        }
        // If both matrix don't have the same size, return null value
        else {
            return null;
        }
    }

    public MatrixOperation subtract(MatrixOperation m1, MatrixOperation m2 ){

        //  Variable declaration
        int m1_row = m1.getRow();
        int m1_column = m1.getColumn();
        int m2_row = m2.getRow();
        int m2_column = m2.getColumn();

        MatrixOperation result_matrix = new MatrixOperation(m1_row, m1_column);
        double result_value;

        // Iterate the matrix to assign the values of the subtract
        // just if both matrix have the same size
        if ( m1_row == m2_row && m1_column == m2_column ) {
            for (int i = 0; i < m1_row; i++) {
                for (int j = 0; j < m1_column; j++){
                    result_value = subtract(m1.getValue( i, j ), m2.getValue( i, j));
                    result_matrix.setValue( i, j, result_value);
                }
            }
            return result_matrix;
        }
        // If both matrix don't have the same size, return null value
        else {
            return null;
        }
    }

}
