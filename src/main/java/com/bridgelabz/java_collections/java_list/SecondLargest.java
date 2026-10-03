package com.bridgelabz.java_collections.java_list;
import java.util.*;

public class SecondLargest {

    public static int secondLargest(List<Integer> list) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int value : list) {

            if (value > largest) {
                secondLargest = largest;
                largest = value;
            }
            else if (value > secondLargest && value != largest) {
                secondLargest = value;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        List<Integer> list =
                new ArrayList<>(Arrays.asList(10, 40, 20, 50, 30));

        System.out.println(secondLargest(list));
    }
}
