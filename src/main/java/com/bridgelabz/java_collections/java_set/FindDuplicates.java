package com.bridgelabz.java_collections.java_set;

import java.util.*;
public class FindDuplicates {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 2, 4, 1);

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();

        for (int value : list) {

            if (!seen.add(value)) {
                duplicates.add(value);
            }
        }

        System.out.println(duplicates);
    }
}
