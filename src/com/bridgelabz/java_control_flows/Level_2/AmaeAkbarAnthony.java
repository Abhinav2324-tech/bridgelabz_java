package com.bridgelabz.java_control_flows.Level_2;
import java.util.Scanner;
/*
 * This program compares the ages and heights of Amar, Akbar, and Anthony.
 * It takes their ages and heights as input from the user.
 * It finds the youngest person by comparing their ages.
 * It also finds the tallest person by comparing their heights.
 * Finally, it displays the youngest and tallest person.
 */
public class AmaeAkbarAnthony {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the age of Amar:");
        int amarAge=input.nextInt();
        System.out.println("Enter the age of Akbar:");
        int akbarAge=input.nextInt();
        System.out.println("Enter the age of Anthony");
        int anthonyAge=input.nextInt();
        System.out.println("Enter height of Amar:");
        int amarHeight=input.nextInt();
        System.out.println("Enter height of Akbar:");
        int akbarHeight=input.nextInt();
        System.out.println("Enter height of Anthony:");
        int anthonyHeight=input.nextInt();
        if(amarAge<akbarAge&&amarAge<anthonyAge)
            System.out.println("Amar is the youngest");
        else if(akbarAge<amarAge&&akbarAge<anthonyAge)
            System.out.println("Akbar is the youngest");
        else
            System.out.println("Anthony is the youngest");
        if(amarHeight>akbarHeight&&amarHeight>anthonyHeight)
            System.out.println("Amar is the tallest");
        else if(akbarHeight>amarHeight&&akbarHeight>anthonyHeight)
            System.out.println("Akbar is the tallest");
        else
            System.out.println("Anthony is the tallest");
        input.close();
    }
}
