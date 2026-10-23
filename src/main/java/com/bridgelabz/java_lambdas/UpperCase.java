package com.bridgelabz.java_lambdas;

import java.util.function.Function;

public class UpperCase {
    public static void main(String[] args) {

        Function<String, String> uppercase =
                str -> str.toUpperCase();

        Function<String, Integer> length =
                str -> str.length();

        System.out.println(uppercase.apply("java"));
        System.out.println(length.apply("SpringBoot"));

        // Function chaining
        Function<String, Integer> combined =
                uppercase.andThen(length);

        System.out.println(combined.apply("hello"));
    }
}