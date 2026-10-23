package com.bridgelabz.java_streamapi;

import java.util.*;

public class SecondHighest {
    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 40, 20, 50, 30, 50);

        Integer result = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(result);
    }
}
