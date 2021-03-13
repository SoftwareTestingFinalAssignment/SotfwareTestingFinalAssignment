package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorTest {

    @Test
    void add2Numbers() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(3, calc.add(1,2));
    }

    @Test
    void substract2Numbers(){
        Calculator calc = new Calculator();
        Assertions.assertEquals(2, calc.substract(3,1));
    }

    @Test
    void multiply2Numbers(){
        Calculator calc = new Calculator();
        Assertions.assertEquals(6, calc.multiply(3,2));
    }

    @Test
    void multiplyBy0(){
        Calculator calc = new Calculator();
        Assertions.assertEquals(0, calc.multiply(3,0));
    }

    @Test
    void divide2Numbers(){
        Calculator calc = new Calculator();
        Assertions.assertEquals(2, calc.divide(6,3));
    }

    /*
    @Test
    void divideBy0(){
        //This checks for the arithmetic exception when we divide by 0
        //We wrote Exception.class so we were able to capture more exceptions
        //but with ArithmethicException.class could be more precise in this case
        Calculator calc = new Calculator();
        Assert.assertThrows(Exception.class, () -> {
            calc.divide(1,0);
        });
    }
    */

    @Test
    void add2Matrices(){
        int row = 4;
        int column = 4;
        Calculator calc = new Calculator();
        String res,expectedRes;
        MatrixOperation matrix1 = new MatrixOperation(row,column);
        MatrixOperation matrix2 = new MatrixOperation(row,column);
        MatrixOperation matrix3 = new MatrixOperation(row,column);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1.setValue(i, j, 2);
                matrix2.setValue(i, j, 1);
                matrix3.setValue(i, j, 3);
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
        Calculator calc = new Calculator();
        String res,expectedRes;
        MatrixOperation matrix1 = new MatrixOperation(row,column);
        MatrixOperation matrix2 = new MatrixOperation(row,column);
        MatrixOperation matrix3 = new MatrixOperation(row,column);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1.setValue(i, j, 3);
                matrix2.setValue(i, j, 1);
                matrix3.setValue(i, j, 2);
            }
        }
        res = calc.substract(matrix1,matrix2).toString();
        expectedRes = matrix3.toString();
        Assertions.assertEquals(expectedRes,res);
    }

    //todo: add/substract 2 matrices with different dimensions

}