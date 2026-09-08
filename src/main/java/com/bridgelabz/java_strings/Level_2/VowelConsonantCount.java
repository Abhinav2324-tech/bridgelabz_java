package com.bridgelabz.java_strings.Level_2;
/*
 * This program finds the number of vowels and consonants in a given string.
 * It checks each character and identifies it as a vowel, consonant, or not a letter.
 * It counts the total number of vowels and consonants using a separate method.
 * Finally, it displays the vowel and consonant count.
 */

import java.util.Scanner;

public class VowelConsonantCount {

    public static String checkCharacter(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            }
            else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    public static int[] findVowelsAndConsonants(String text) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {

            String result = checkCharacter(text.charAt(i));

            if (result.equals("Vowel")) {
                vowels++;
            }
            else if (result.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = input.nextLine();

        int[] result = findVowelsAndConsonants(text);

        System.out.println("Number of Vowels = " + result[0]);
        System.out.println("Number of Consonants = " + result[1]);

        input.close();
    }
}
