package com.bridgelabz.java_arrays.Level_1;
import java.util.Scanner;
/*
 * This program takes 5 numbers as input from the user and stores them in an array.
 * It checks whether each number is positive, negative, or zero.
 * For positive numbers, it also checks whether the number is even or odd.
 * Finally, it compares the first and last elements of the array.
 */
public class NumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter the number " + (i + 1) + " : ");
            nums[i] = input.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (nums[i] % 2 == 0) {
                    System.out.println(nums[i] + " is positive and even.");
                } else {
                    System.out.println(nums[i] + " is positive and odd.");
                }
            } else if (nums[i] < 0) {
                System.out.println(nums[i] + " is negative.");
            } else {
                System.out.println(nums[i] + " is zero.");
            }
        }
        if (nums[0] == nums[4]) {
            System.out.println("First and last element are equal.");
        } else if (nums[0] > nums[4]) {
            System.out.println("First element is greater than the last");
        } else {
            System.out.println("First element is less than the last element");
        }
        input.close();
    }
}
