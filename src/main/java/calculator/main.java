package calculator;

public class main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int var1 = 3;
        int var2 = 5;
        int var3 = 7;
        int var4 = -4;
        double var5 = 6.6666;
        double var6 = 3;

        double result;
        int row = 2;
        int column = 2;
        MatrixOperation matrix_result = new MatrixOperation(row,column);

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

        result = calculator.substract( var1, var3);
        System.out.println("Substract: "+result);

        result = calculator.multiply(var1,var4);
        System.out.println("Multiply: "+result);

        result = calculator.divide(var5, var6);
        System.out.println("Divide: "+result);

        matrix_result = calculator.add(matrix1, matrix2);
        System.out.println("Add array: "+matrix_result);

        matrix_result = calculator.substract(matrix1, matrix2);
        System.out.println("Substract array: "+matrix_result);
    }

}
