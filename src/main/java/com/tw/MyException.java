package com.tw;

public class MyException {

    public void isNegative(int number) {
        if (number < 0) {
            throw new ArithmeticException("Number shouldn't be negative");
        }
    }
}
