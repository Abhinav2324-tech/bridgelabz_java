package com.bridgelabz.java_control_flows.Level_1;

import java.util.Scanner;
/*
 * This program performs a countdown using a for loop.
 * It takes the starting counter value as input from the user.
 * It displays the numbers in decreasing order until the counter reaches 1.
 * Finally, it displays "Launch!" after the countdown is completed.
 */
public class RocketLaunch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the counter:");
        int counter=input.nextInt();
       for(int i=counter;i>=1;i--){
           System.out.println(i);
       }
        System.out.println("Launch!");
        input.close();
    }
}
