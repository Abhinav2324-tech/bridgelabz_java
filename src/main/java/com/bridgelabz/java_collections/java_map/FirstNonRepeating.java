package com.bridgelabz.java_collections.java_map;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 40};

        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int value : arr) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }

        // Find first element with frequency 1
        for (int value : arr) {
            if (map.get(value) == 1) {
                System.out.println("First non-repeating element: " + value);
                break;
            }
        }
    }
}