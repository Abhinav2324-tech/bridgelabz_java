package com.bridgelabz.java_collections.java_set;
import java.util.*;

    public class Difference {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5));

        // Union
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);

        // Intersection
        Set<Integer> common = new HashSet<>(set1);
        common.retainAll(set2);

        // Remove common elements
        result.removeAll(common);

        System.out.println(result);
    }
}
