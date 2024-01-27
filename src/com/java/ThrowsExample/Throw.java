package com.java.ThrowsExample;
//throw is used to explicitly(confusion) throw an exception
public class Throw  {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method that declares it may throw an exception
    public static int divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }
}
