package com.bridgelabz.java_collections.java_set;
import java.util.*;

public class Equal {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(10);
        set1.add(20);
        set1.add(30);

        set2.add(30);
        set2.add(10);
        set2.add(20);

        if (set1.equals(set2)) {
            System.out.println("Sets are equal");
        } else {
            System.out.println("Sets are not equal");
        }
    }
}