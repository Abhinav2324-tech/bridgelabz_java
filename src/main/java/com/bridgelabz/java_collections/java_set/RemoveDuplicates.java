package com.bridgelabz.java_collections.java_set;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 2, 2, 3, 1, 4));

        Set<Integer> set = new LinkedHashSet<>(list);

        List<Integer> result = new ArrayList<>(set);

        System.out.println(result);
    }
}
