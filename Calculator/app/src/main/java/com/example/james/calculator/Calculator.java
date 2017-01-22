package com.example.james.calculator;

/**
 * Created by James on 1/21/2017.
 */
public class Calculator {
    public int plus(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int minus(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        if (secondNumber == 0){
            throw  new DividedByZeroException();
        }
        return firstNumber/secondNumber;
    }
}
