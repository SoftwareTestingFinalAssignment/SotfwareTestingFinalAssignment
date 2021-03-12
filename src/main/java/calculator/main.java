package calculator;

public class main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result;
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
        result = calculator.add(2,3);
        System.out.println("Add: "+result);

        result = calculator.substract(4, 5);
        System.out.println("Substract: "+result);

        result = calculator.multiply(2,3);
        System.out.println("Multiply: "+result);

        result = calculator.divide(4, 5);
        System.out.println("Divide: "+result);

        matrix_result = calculator.add(matrix1, matrix2);
        System.out.println("Add array: "+matrix_result);

        matrix_result = calculator.substract(matrix1, matrix2);
        System.out.println("Substract array: "+matrix_result);
    }

}
