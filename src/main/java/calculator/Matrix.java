package calculator;

import java.util.Arrays;

public class Matrix {
    private int [][] matrix;
    private int row;
    private int column;

    public Matrix(int row, int column){
        this.row = row;
        this.column = column;
        matrix = new int[row][column];
    }

    public Matrix (int [][] matrix){
        this.matrix = matrix;
        row = matrix.length;
        column = matrix[0].length;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public int getValue ( int row, int column ){
        return matrix[row][column];
    }

    public int[][] setValue (int row, int column, int value ){
        matrix[row][column] = value;
        return matrix;
    }

    @Override
    public String toString() {
        String array_tostring = "";
        for (int i = 0; i < row; i++) {
            array_tostring += "[ ";
            for (int j = 0; j < column; j++ ){
                if (j < column-1)
                    array_tostring += matrix [i][j]+ ", ";
                else array_tostring += matrix [i][j];
            }
            array_tostring += " ]";
        }
        return "[ " + array_tostring + " ]";
    }
}