package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


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
        double res = calc.substract(value1,value2);
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
        //This checks for the arithmetic exception when we divide by 0
        //We wrote Exception.class so we were able to capture more exceptions
        //but with ArithmethicException.class could be more precise in this case
        Calculator calc = new Calculator();
        double resultDiv = calc.divide(3,0);
        assertEquals("Divide by zero gives infinity as result", true, Double.isInfinite(resultDiv));
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
        res = calc.substract(matrix1,matrix2).toString();
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
        res = calc.substract(matrix1,matrix2).toString();
        expectedRes = matrix3.toString();
        Assertions.assertEquals(expectedRes,res);
    }

    //todo: add/substract 2 matrices with different dimensions

}