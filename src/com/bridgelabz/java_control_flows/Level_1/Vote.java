package com.bridgelabz.java_control_flows.Level_1;
import java.util.Scanner;
/*
 * This program checks whether a person is eligible to vote.
 * It takes the age of the person as input from the user.
 * It checks if the person's age is 18 or above.
 * Finally, it displays whether the person can vote or cannot vote.
 */
public class Vote {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int age;
        System.out.println("Enter the age of the person:");
        age=input.nextInt();
        if(age>=18)
            System.out.println("The person's age is "+age+" and can vote");
        else
            System.out.println("The person's age is "+age+" and cannot vote");
        input.close();
    }
}
