package com.bridgelabz.java_tdd;

public class StringService {

    public String toUpperCase(String text) {

        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }

        return text.toUpperCase();
    }

    public int getLength(String text) {

        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }

        return text.length();
    }

    public String reverse(String text) {

        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        return reversed;
    }
}