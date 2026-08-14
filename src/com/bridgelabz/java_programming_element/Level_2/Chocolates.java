package com.bridgelabz.java_programming_element.Level_2;
import java.util.Scanner;
/*
 * This program distributes chocolates equally among children.
 * It takes the number of children and number of chocolates as input from the user.
 * It calculates the number of chocolates each child receives and the chocolates remaining.
 * Finally, it displays the chocolates received by each child and the remaining chocolates.
 */
public class Chocolates {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double numberOfChildren;
        System.out.println("Enter the number of children:");
        numberOfChildren=input.nextDouble();
        double numberOfchocolates;
        System.out.println("Enter the number of chocolates:");
        numberOfchocolates=input.nextDouble();
        double chocolatesReceived=(int)(numberOfChildren/numberOfchocolates);
        double chocolatesRemaining=numberOfChildren%numberOfchocolates;
        System.out.println("The number of chocolates each child gets is "+chocolatesReceived+" and the number of remaining chocolates are "+chocolatesRemaining);
        input.close();
    }
}
