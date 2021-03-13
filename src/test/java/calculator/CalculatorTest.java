package calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;


class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add2Numbers() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(3, calc.add(1,2));
    }

    @org.junit.jupiter.api.Test
    void substract2Numbers(){
        Calculator calc = new Calculator();
        Assertions.assertEquals(2, calc.substract(3,1));
    }

    @org.junit.jupiter.api.Test
    void multiply2Numbers(){
        Calculator calc = new Calculator();
        Assertions.assertEquals(6, calc.multiply(3,2));
    }

    @org.junit.jupiter.api.Test
    void multiplyBy0(){
        Calculator calc = new Calculator();
        Assertions.assertEquals(0, calc.multiply(3,0));
    }

    @org.junit.jupiter.api.Test
    void divide2Numbers(){
        Calculator calc = new Calculator();
        Assertions.assertEquals(2, calc.divide(6,3));
    }

    /*@org.junit.jupiter.api.Test
    void divideBy0(){
        //This checks for the arithmetic exception when we divide by 0
        //We wrote Exception.class so we were able to capture more exceptions
        //but with ArithmethicException.class could be more precise in this case
        Calculator calc = new Calculator();
        Assert.assertThrows(Exception.class, () -> {
            calc.divide(1,0);
        });
    }*/

}