package com.bridgelabz.java_junit;

public class Test {
    static void divide(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("Division by zero not possible");
        }
        int result = a / b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}