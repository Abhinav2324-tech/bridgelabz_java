package com.bridgelabz.java_strings.Level_2;
/*
 * This program splits a complete text into words without using the built-in split() method.
 * It finds the string length manually, identifies the positions of spaces,
 * extracts each word using charAt(), and compares the result with split().
 * Finally, it displays both results and whether they are equal.
 */

import java.util.Scanner;

public class SplitText {

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

    public static String[] splitText(String text) {

        int length = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount + 1];

        spaceIndexes[0] = -1;

        int index = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index] = i;
                index++;
            }
        }

        spaceIndexes[index] = length;

        String[] words = new String[wordCount];

        for (int i = 0; i < wordCount; i++) {

            String word = "";

            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word = word + text.charAt(j);
            }

            words[i] = word;
        }

        return words;
    }

    public static boolean compareArrays(String[] array1, String[] array2) {

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = input.nextLine();

        String[] result1 = splitText(text);

        String[] result2 = text.split(" ");

        boolean result = compareArrays(result1, result2);

        System.out.println("Using user-defined method:");

        for (int i = 0; i < result1.length; i++) {
            System.out.println(result1[i]);
        }

        System.out.println("Using split() method:");

        for (int i = 0; i < result2.length; i++) {
            System.out.println(result2[i]);
        }

        System.out.println("Both results are equal = " + result);

        input.close();
    }
}