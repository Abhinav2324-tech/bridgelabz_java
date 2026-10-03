package com.bridgelabz.java_collections.java_set;

import java.util.*;

public class Common {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 3, 7};

        Set<Integer> set = new HashSet<>();

        for (int value : arr1) {
            set.add(value);
        }

        boolean found = false;

        for (int value : arr2) {
            if (set.contains(value)) {
                found = true;
                break;

            }

        }

        System.out.println(found);
    }
}
