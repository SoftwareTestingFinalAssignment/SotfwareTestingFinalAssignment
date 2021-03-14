package calculator;

public class main {
    public static void main(String[] args) {

        // Variable declaration

        Calculator calculator = new Calculator();

        double var0 = 0;
        double var1 = 6;
        double var2 = 4;
        double var3 = -3;
        double var4 = -2;
        double var5 = 0;


        double result;
        int row = 3;
        int column = 3;
        new MatrixOperation(row, column);
        MatrixOperation matrix_result;

        // Initialize matrix
        int counter = 0;
        MatrixOperation matrix1 = new MatrixOperation(row,column);
        MatrixOperation matrix2 = new MatrixOperation(row,column);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1.setValue(i, j, counter);
                matrix2.setValue(i, j, counter);
                counter++;
            }
        }

        // Checking operations
        result = calculator.add(var2, var1);
        System.out.println("Add: "+result);

        result = calculator.subtract( var1, var3);
        System.out.println("Substract: "+result);

        result = calculator.multiply(var1,var4);
        System.out.println("Multiply: "+result);

        result = calculator.divide(var5, var0);
        System.out.println("Divide: "+result);

        matrix_result = calculator.add(matrix1, matrix2);
        System.out.println("Add array: "+matrix_result);

        matrix_result = calculator.subtract(matrix1, matrix2);
        System.out.println("Substract array: "+matrix_result);
    }

}
