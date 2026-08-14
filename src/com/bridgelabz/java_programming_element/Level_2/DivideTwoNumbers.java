package com.bridgelabz.java_programming_element.Level_2;
import java.util.Scanner;
/*program to find quotient and remainder of 2 numbers.
'/' for quotient and '%' for remainder
 */
public class DivideTwoNumbers {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double number1;
        double number2;
        System.out.println("Enter number 1:");
        number1=input.nextDouble();
        System.out.println("Enter number 2");
        number2=input.nextDouble();
        double quotient=number2/number1;
        double remainder=number2%number1;
        System.out.println("The Quotient is "+quotient+" and Reminder is "+remainder+" of two numbers "+number1+" and "+number2);
        input.close();
    }
}
