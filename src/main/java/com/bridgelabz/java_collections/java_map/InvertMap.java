package com.bridgelabz.java_collections.java_map;
import java.util.*;

public class InvertMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        Map<Integer, List<String>> inverted = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            int value = entry.getValue();
            String key = entry.getKey();

            if (!inverted.containsKey(value)) {
                inverted.put(value, new ArrayList<>());
            }

            inverted.get(value).add(key);
        }

        System.out.println(inverted);
    }
}