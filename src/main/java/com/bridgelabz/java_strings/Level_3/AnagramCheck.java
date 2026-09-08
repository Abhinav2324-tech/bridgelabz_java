package com.bridgelabz.java_strings.Level_3;
/*
 * This program checks whether two given texts are anagrams.
 * It compares their lengths and finds the frequency of each character.
 * It compares the character frequencies of both texts to check for an anagram.
 * Finally, it displays whether the two texts are anagrams or not.
 */

import java.util.Scanner;

public class AnagramCheck {

    public static boolean isAnagram(String text1, String text2) {

        if (text1.length() != text2.length()) {
            return false;
        }

        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first text:");
        String text1 = input.nextLine();

        System.out.println("Enter second text:");
        String text2 = input.nextLine();

        boolean result = isAnagram(text1, text2);

        if (result) {
            System.out.println("The two texts are anagrams.");
        }
        else {
            System.out.println("The two texts are not anagrams.");
        }

        input.close();
    }
}