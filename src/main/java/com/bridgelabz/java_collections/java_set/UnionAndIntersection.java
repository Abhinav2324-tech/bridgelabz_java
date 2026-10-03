package com.bridgelabz.java_collections.java_set;

import java.util.*;

public class UnionAndIntersection {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5));

        // Union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        // Intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}