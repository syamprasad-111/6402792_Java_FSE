package com.TestFixtures;

public class ArithmeticOperations {
    public int addition(int a, int b) {
        return a+b;
    }

    public int division(int a, int b) {
        if (b == 0)
            throw new IllegalArgumentException("Cannot divide by zero");
        return a/b;
    }
}
