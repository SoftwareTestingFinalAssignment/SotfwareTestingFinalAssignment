package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class CalculatorTest {

    @Test
    void add2Numbers() {
        // We are testing if the addition process is completed successfully
        // In this example we are testing that 3 = 1 + 2
        Calculator calc = new Calculator();
        double expectedRes = 3;
        double value1 = 1;
        double value2 = 2;
        double res = calc.add(value1,value2);
        Assertions.assertEquals(expectedRes, res);
    }

    @Test
    void substract2Numbers(){
        // We are testing if the subtraction process is completed successfully
        // In this example we are testing that 2 = 3 - 1
        Calculator calc = new Calculator();
        double expectedRes = 2;
        double value1 = 3;
        double value2 = 1;
        double res = calc.subtract(value1,value2);
        Assertions.assertEquals(expectedRes, res);
    }

    @Test
    void multiply2Numbers(){
        // We are testing if the multiplication process is completed successfully
        // In this example we are testing that 6 = 3 - 1
        Calculator calc = new Calculator();
        double expectedRes = 6;
        double value1 = 3;
        double value2 = 2;
        double res = calc.multiply(value1,value2);
        Assertions.assertEquals(expectedRes, res);
    }

    @Test
    void multiplyBy0(){
        // We are testing if the multiplication process works properly when one operator is 0
        // In this example we are testing that 0 = 3 * 0
        Calculator calc = new Calculator();
        double expectedRes = 0;
        double value1 = 3;
        double value2 = 0;
        double res = calc.multiply(value1,value2);
        Assertions.assertEquals(expectedRes, res);
    }

    @Test
    void divide2Numbers(){
        // We are testing if the division process is completed successfully
        // In this example we are testing that 2 = 6 / 3
        Calculator calc = new Calculator();
        double expectedRes = 2;
        double value1 = 6;
        double value2 = 3;
        double res = calc.divide(value1,value2);
        Assertions.assertEquals(expectedRes, res);
    }

    @Test
    void divideBy0(){
        // We are testing if the division process is completed successfully
        // In this example we are testing that Infinity = 3 / 0
        Calculator calc = new Calculator();
        double value1 = 3;
        double value2 = 0;
        double resultDiv = calc.divide(value1,value2);
        Assertions.assertTrue(Double.isInfinite(resultDiv));
    }

    @Test
    void add2Matrices(){
        // We are testing if the addition of matrices is completed successfully
        // In this example we are testing if [3 3 3 3],[3 3 3 3],[3 3 3 3],[3 3 3 3] = [1 1 1 1],[1 1 1 1],[1 1 1 1],[1 1 1 1] + [2 2 2 2],[2 2 2 2],[2 2 2 2],[2 2 2 2]
        int row = 4;
        int column = 4;
        int valueMat1 = 2;
        int valueMat2 = 1;
        int valueMat3 = 3;
        Calculator calc = new Calculator();
        String res,expectedRes;
        MatrixOperation matrix1 = new MatrixOperation(row,column);
        MatrixOperation matrix2 = new MatrixOperation(row,column);
        MatrixOperation matrix3 = new MatrixOperation(row,column);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1.setValue(i, j, valueMat1);
                matrix2.setValue(i, j, valueMat2);
                matrix3.setValue(i, j, valueMat3);
            }
        }
        res = calc.add(matrix1,matrix2).toString();
        expectedRes = matrix3.toString();
        Assertions.assertEquals(expectedRes,res);
    }

    @Test
    void substract2Matrices(){
        // We are testing if the subtraction of matrices is completed successfully
        // In this example we are testing if [1 1 1 1],[1 1 1 1],[1 1 1 1],[1 1 1 1] = [2 2 2 2],[2 2 2 2],[2 2 2 2],[2 2 2 2] - [1 1 1 1],[1 1 1 1],[1 1 1 1],[1 1 1 1]
        int row = 4;
        int column = 4;
        int valueMat1 = 2;
        int valueMat2 = 1;
        int valueMat3 = 1;
        Calculator calc = new Calculator();
        String res,expectedRes;
        MatrixOperation matrix1 = new MatrixOperation(row,column);
        MatrixOperation matrix2 = new MatrixOperation(row,column);
        MatrixOperation matrix3 = new MatrixOperation(row,column);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1.setValue(i, j, valueMat1);
                matrix2.setValue(i, j, valueMat2);
                matrix3.setValue(i, j, valueMat3);
            }
        }
        res = calc.subtract(matrix1,matrix2).toString();
        expectedRes = matrix3.toString();
        Assertions.assertEquals(expectedRes,res);
    }

    @Test
    void substract2MatricesWithNegativeValuesAsResult(){
        // We are testing if the subtraction of matrices which return negative values as result
        // In this example we are testing if [-1 -1 -1 -1],[-1 -1 -1 -1],[-1 -1 -1 -1],[-1 -1 -1 -1] = [2 2 2 2],[2 2 2 2],[2 2 2 2],[2 2 2 2] - [3 3 3 3],[3 3 3 3],[3 3 3 3],[3 3 3 3]
        int row = 4;
        int column = 4;
        int valueMat1 = 2;
        int valueMat2 = 3;
        int valueMat3 = -1;
        Calculator calc = new Calculator();
        String res,expectedRes;
        MatrixOperation matrix1 = new MatrixOperation(row,column);
        MatrixOperation matrix2 = new MatrixOperation(row,column);
        MatrixOperation matrix3 = new MatrixOperation(row,column);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1.setValue(i, j, valueMat1);
                matrix2.setValue(i, j, valueMat2);
                matrix3.setValue(i, j, valueMat3);
            }
        }
        res = calc.subtract(matrix1,matrix2).toString();
        expectedRes = matrix3.toString();
        Assertions.assertEquals(expectedRes,res);
    }

    @Test
    void add2MatricesWithDiffernentDimensions(){
        // We are testing how does the addition of two matrices work
        // In this example we are testing if null = [2 2 2 2],[2 2 2 2],[2 2 2 2],[2 2 2 2] + [1 1 1 ],[1 1 1],[1 1 1]
        int row = 4;
        int column = 4;
        int row2 = 3;
        int column2 = 3;
        int valueMat1 = 2;
        int valueMat2 = 1;
        Calculator calc = new Calculator();
        MatrixOperation matrix1 = new MatrixOperation(row,column);
        MatrixOperation matrix2 = new MatrixOperation(row2,column2);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1.setValue(i, j, valueMat1);
            }
        }
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                matrix2.setValue(i, j, valueMat2);
            }
        }
        Assertions.assertNull(calc.add(matrix1,matrix2));
    }


    @Test
    void substract2MatricesWithDiffernentDimensions(){
        // We are testing how does the subtraction of two matrices work
        // In this example we are testing if null = [2 2 2 2],[2 2 2 2],[2 2 2 2],[2 2 2 2] - [1 1 1 ],[1 1 1],[1 1 1]
        int row = 4;
        int column = 4;
        int row2 = 3;
        int column2 = 3;
        int valueMat1 = 2;
        int valueMat2 = 1;
        Calculator calc = new Calculator();
        MatrixOperation matrix1 = new MatrixOperation(row,column);
        MatrixOperation matrix2 = new MatrixOperation(row2,column2);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1.setValue(i, j, valueMat1);
            }
        }
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                matrix2.setValue(i, j, valueMat2);
            }
        }
        Assertions.assertNull(calc.subtract(matrix1,matrix2));
    }

    @Test
    void add2MatricesWithoutFillingTheSecondOne(){
        // We are testing if the addition of matrices is completed successfully when we don´t establish the values of the matrix
        // In this example we are testing if null = [2 2 2 2],[2 2 2 2],[2 2 2 2],[2 2 2 2] + [1 1 1 ],[1 1 1],[1 1 1]
        int row = 4;
        int column = 4;
        int valueMat = 2;
        Calculator calc = new Calculator();
        String res,expectedRes;
        MatrixOperation matrix1 = new MatrixOperation(row,column);
        MatrixOperation matrix2 = new MatrixOperation(row,column);
        MatrixOperation matrix3 = new MatrixOperation(row,column);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1.setValue(i, j, valueMat);
                matrix3.setValue(i, j, valueMat);
            }
        }
        res = calc.add(matrix1,matrix2).toString();
        expectedRes = matrix3.toString();
        Assertions.assertEquals(expectedRes,res);
    }

    @Test
    void subtract2MatricesWithoutFillingTheSecondOne(){
        // We are testing if the subtraction of matrices is completed successfully when we don´t establish the values of the matrix
        // In this example we are testing if null = [2 2 2 2],[2 2 2 2],[2 2 2 2],[2 2 2 2] + [2 2 2],[2 2 2],[2 2 2]
        int row = 4;
        int column = 4;
        int valueMat = 2;
        Calculator calc = new Calculator();
        String res,expectedRes;
        MatrixOperation matrix1 = new MatrixOperation(row,column);
        MatrixOperation matrix2 = new MatrixOperation(row,column);
        MatrixOperation matrix3 = new MatrixOperation(row,column);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1.setValue(i, j, valueMat);
                matrix3.setValue(i, j, valueMat);
            }
        }
        res = calc.subtract(matrix1,matrix2).toString();
        expectedRes = matrix3.toString();
        Assertions.assertEquals(expectedRes,res);
    }
}