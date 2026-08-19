package com.bridgelabz.java_strings.Level_3;
/*
 * This program finds the unique characters present in a given string.
 * It finds the length of the string without using the built-in length() method.
 * It uses charAt() and nested loops to identify and store unique characters.
 * Finally, it displays all the unique characters in the string.
 */

import java.util.Scanner;

public class UniqueCharacters {

    public static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        }
        catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static char[] findUniqueCharacters(String text) {

        int length = findLength(text);

        char[] unique = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {

            boolean isUnique = true;

            for (int j = 0; j < i; j++) {

                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[index] = text.charAt(i);
                index++;
            }
        }

        char[] result = new char[index];

        for (int i = 0; i < index; i++) {
            result[i] = unique[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = input.nextLine();

        char[] result = findUniqueCharacters(text);

        System.out.println("Unique characters are:");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        input.close();
    }
}