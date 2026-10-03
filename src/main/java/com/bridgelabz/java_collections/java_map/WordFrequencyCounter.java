package com.bridgelabz.java_collections.java_map;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String text = "Hello world, hello Java!";

        // Convert to lowercase
        text = text.toLowerCase();

        // Remove punctuation
        text = text.replaceAll("[^a-zA-Z0-9 ]", "");

        // Split sentence into words
        String[] words = text.split("\\s+");

        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {

            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println(map);
    }
}
