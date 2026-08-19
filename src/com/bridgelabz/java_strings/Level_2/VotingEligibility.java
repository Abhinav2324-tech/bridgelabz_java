package com.bridgelabz.java_strings.Level_2;
/*
 * This program generates random two-digit ages for 10 students.
 * It checks whether each student is eligible to vote based on their age.
 * It stores the age and voting eligibility in a 2D String array.
 * Finally, it displays the age and voting eligibility in tabular format.
 */

public class VotingEligibility {

    public static int[] generateAges(int numberOfStudents) {

        int[] ages = new int[numberOfStudents];

        for (int i = 0; i < ages.length; i++) {
            ages[i] = 10 + (int) (Math.random() * 90);
        }

        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false";
            }
            else if (ages[i] >= 18) {
                result[i][1] = "true";
            }
            else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    public static void displayResult(String[][] result) {

        System.out.println("Age\tCan Vote");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {

        int[] ages = generateAges(10);

        String[][] result = checkVotingEligibility(ages);

        displayResult(result);
    }
}