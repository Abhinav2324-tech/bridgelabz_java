package com.bridgelabz.java_exceptions;

public class ExceptionPropagation {

    public static void method1() throws ArithmeticException {

        int result = 10 / 0;   // throws ArithmeticException
    }

    public static void method2() throws ArithmeticException {

        method1();
    }

    public static void main(String[] args) {

        try {
            method2();

        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
