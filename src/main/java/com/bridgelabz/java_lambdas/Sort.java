package com.bridgelabz.java_lambdas;

import java.util.*;

public class Sort {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(
                Arrays.asList("Rahul", "Amit", "Priya", "Sneha")
        );

        names.sort((a, b) -> a.compareTo(b));
        System.out.println("Ascending: " + names);

        names.sort((a, b) -> b.compareTo(a));
        System.out.println("Descending: " + names);
    }
}