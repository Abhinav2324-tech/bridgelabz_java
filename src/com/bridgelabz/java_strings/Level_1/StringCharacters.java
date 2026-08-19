package com.bridgelabz.java_strings.Level_1;
/*
 * This program returns all the characters of a string using a user-defined method.
 * It also gets the characters using the built-in toCharArray() method.
 * It compares both character arrays using a separate method.
 * Finally, it displays the characters and whether both arrays are equal.
 */

import java.util.Scanner;

public class StringCharacters {

    public static char[] getCharacters(String text) {

        char[] characters = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }

        return characters;
    }

    public static boolean compareArrays(char[] array1, char[] array2) {

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = input.next();

        char[] characters1 = getCharacters(text);

        char[] characters2 = text.toCharArray();

        boolean result = compareArrays(characters1, characters2);

        System.out.print("Characters using user-defined method: ");
        for (int i = 0; i < characters1.length; i++) {
            System.out.print(characters1[i] + " ");
        }

        System.out.println();

        System.out.print("Characters using toCharArray(): ");
        for (int i = 0; i < characters2.length; i++) {
            System.out.print(characters2[i] + " ");
        }

        System.out.println();

        System.out.println("Both arrays are equal = " + result);

        input.close();
    }
}