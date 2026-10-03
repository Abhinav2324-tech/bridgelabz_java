package com.bridgelabz.java_collections.java_set;

import java.util.*;

public class Subset {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(List.of(2, 3));
        Set<Integer> set2 = new HashSet<>(List.of(1, 2, 3, 4));

        boolean result = set2.containsAll(set1);

        System.out.println(result);
    }
}
