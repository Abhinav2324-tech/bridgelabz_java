package com.bridgelabz.java_control_flows.Level_1;

/*
 * Program to take month and day as command-line arguments
 * and check whether the given date falls in the Spring Season.
 * Spring Season is from March 20 to June 20.
 */
public class SpringSeason {
    public static void main(String[] args) {

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        if ((month == 3 && day >= 20) ||
                (month > 3 && month < 6) ||
                (month == 6 && day <= 20)) {

            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}