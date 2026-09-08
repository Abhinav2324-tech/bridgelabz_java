package com.bridgelabz.java_arrays.Level_1;
import java.util.Scanner;
/*
 * This program takes the ages of 10 students as input from the user.
 * It stores the ages in an array.
 * It checks whether each student is eligible to vote.
 * If the age is negative, it displays invalid age.
 * Finally, it displays whether each student can vote or cannot vote.
 */
public class StudentVote {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] age=new int[5];
        for(int i=0;i<age.length;i++){
            System.out.println("Enter age of student "+(i+1)+":");
            age[i]=input.nextInt();
        }
        for(int i=0;i<age.length;i++){
            if(age[i]<0)
                System.out.println("Invalid age");
            else if(age[i]>=18)
                System.out.println("The student with age of "+age[i]+" can vote");
            else
                System.out.println("The student with age of "+age[i]+" cannot vote");

        }
        input.close();
    }
}
