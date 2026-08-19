package com.bridgelabz.java_strings.Level_3;
/*
 * This program finds the frequency of each character in a given string using nested loops.
 * It converts the string into a character array and counts duplicate characters.
 * It stores the characters and their frequencies in a String array.
 * Finally, it displays each character along with its frequency.
 */

import java.util.Scanner;

public class CharacterFrequency {

    public static String[] findFrequency(String text) {

        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];

        for (int i = 0; i < characters.length; i++) {

            frequency[i] = 1;

            for (int j = i + 1; j < characters.length; j++) {

                if (characters[i] == characters[j] && characters[i] != '0') {
                    frequency[i]++;
                    characters[j] = '0';
                }
            }
        }

        int count = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                count++;
            }
        }

        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < characters.length; i++) {

            if (characters[i] != '0') {
                result[index] = characters[i] + " = " + frequency[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = input.nextLine();

        String[] result = findFrequency(text);

        System.out.println("Character Frequencies:");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        input.close();
    }
}