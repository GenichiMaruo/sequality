package org.example.app;

public class Calculate {
    public int sum(int x, int y) {
        return x + y;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
    }
}
