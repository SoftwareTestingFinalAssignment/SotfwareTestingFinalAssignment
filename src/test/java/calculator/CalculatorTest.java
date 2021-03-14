package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class CalculatorTest {

    @Test
    void add2Numbers() {
        Calculator calc = new Calculator();
        double expectedRes = 3;
        double value1 = 1;
        double value2 = 2;
        double res = calc.add(value1,value2);
        Assertions.assertEquals(expectedRes, res);
    }

    @Test
    void substract2Numbers(){
        Calculator calc = new Calculator();
        double expectedRes = 2;
        double value1 = 3;
        double value2 = 1;
        double res = calc.subtract(value1,value2);
        Assertions.assertEquals(expectedRes, res);
    }

    @Test
    void multiply2Numbers(){
        Calculator calc = new Calculator();
        double expectedRes = 6;
        double value1 = 3;
        double value2 = 2;
        double res = calc.multiply(value1,value2);
        Assertions.assertEquals(expectedRes, res);
    }

    @Test
    void multiplyBy0(){
        Calculator calc = new Calculator();
        double expectedRes = 0;
        double value1 = 3;
        double value2 = 0;
        double res = calc.multiply(value1,value2);
        Assertions.assertEquals(expectedRes, res);
    }

    @Test
    void divide2Numbers(){
        Calculator calc = new Calculator();
        double expectedRes = 2;
        double value1 = 6;
        double value2 = 3;
        double res = calc.divide(value1,value2);
        Assertions.assertEquals(expectedRes, res);
    }

    @Test
    void divideBy0(){
        Calculator calc = new Calculator();
        double resultDiv = calc.divide(3,0);
        Assertions.assertTrue(Double.isInfinite(resultDiv));
    }

    @Test
    void add2Matrices(){
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
    void substract2MatricesWithoutFillingTheSecondOne(){
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