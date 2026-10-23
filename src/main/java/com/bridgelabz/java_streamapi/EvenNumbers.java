package com.bridgelabz.java_streamapi;
import java.util.*;
import java.util.stream.*;

public class EvenNumbers {
    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(5, 2, 8, 3, 6, 4);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}