package com.bridgelabz.java_lambdas;
import java.util.function.Predicate;

public class EvenOdd {
    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isOdd = n -> n % 2 != 0;
        Predicate<Integer> isPositive = n -> n > 0;

        System.out.println(isEven.test(10));
        System.out.println(isOdd.test(7));
        System.out.println(isPositive.test(-5));
    }
}
