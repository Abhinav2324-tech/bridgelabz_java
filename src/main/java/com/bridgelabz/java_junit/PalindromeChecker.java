package com.bridgelabz.java_junit;

public class PalindromeChecker {

    public boolean isPalindrome(String text) {

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        return text.equals(reversed);
    }
}