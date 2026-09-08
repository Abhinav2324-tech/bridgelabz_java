package com.bridgelabz.java_methods.Level_2;
import java.util.Scanner;

public class StudentVoteChecker {
    public boolean canStudentVote(int age){
        if(age<0){
            return false;
        }
        else if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[10];
        StudentVoteChecker obj = new StudentVoteChecker();
        for (int i = 0; i < ages.length; i++) {
            System.out.println("The ages of student is " + (i + 1) + ":");
            ages[i]=input.nextInt();
            boolean result = obj.canStudentVote(ages[i]);
            if(result){
                System.out.println("Students with age "+ages[i]+" can vote");
            }
            else {
                System.out.println("Students with age "+ages[i]+" cannot vote");
            }
        }
        input.close();
    }
}
