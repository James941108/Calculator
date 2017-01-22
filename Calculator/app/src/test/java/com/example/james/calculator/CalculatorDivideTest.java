package com.example.james.calculator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorDivideTest {
    private Calculator calculator = new Calculator();

    @Test
    public void divide_2_1_should_be_2(){
        int result = calculator.divide(2, 1);
        assertEquals(2, result);
    }

    @Test(expected = DividedByZeroException.class)
    public void divide_2_0_should_be_2(){
        int result = calculator.divide(2, 0);
        assertEquals(2, result);
    }
}
