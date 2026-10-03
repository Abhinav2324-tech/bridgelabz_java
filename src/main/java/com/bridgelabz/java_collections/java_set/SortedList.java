package com.bridgelabz.java_collections.java_set;
import java.util.*;

public class SortedList {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(List.of(5, 3, 9, 1));

        Set<Integer> sortedSet = new TreeSet<>(set);

        List<Integer> list = new ArrayList<>(sortedSet);

        System.out.println(list);
    }
}
