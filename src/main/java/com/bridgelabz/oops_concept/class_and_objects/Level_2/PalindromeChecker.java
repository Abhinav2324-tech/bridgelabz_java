package com.bridgelabz.oops_concept.class_and_objects.Level_2;
/*
This program creates a PalindromeChecker class with text as an attribute.
It checks whether the given text is a palindrome and displays
the result to the user.
*/

import java.util.Scanner;

public class PalindromeChecker {

    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {

        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        return text.equalsIgnoreCase(reverse);
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = input.nextLine();

        PalindromeChecker checker = new PalindromeChecker(text);

        checker.displayResult();

        input.close();
    }
}