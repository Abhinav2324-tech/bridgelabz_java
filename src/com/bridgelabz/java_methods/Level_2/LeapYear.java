package com.bridgelabz.java_methods.Level_2;
import java.util.Scanner;

public class LeapYear {
    public boolean checkLeapYear(int year){
        if(year>=1582){
            if((year%4==0&&year%100!=0)||(year%400==0)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the year:");
        int year=input.nextInt();
        if(year<1582){
            System.out.println("Enter a year greater than or equal to 1582");
            input.close();
            return;
        }
        LeapYear obj=new LeapYear();
        boolean result=obj.checkLeapYear(year);
        if(result){
            System.out.println(year+" is a leap year");
        }
        else {
            System.out.println(year+" is not a leap year");
        }
        input.close();
    }
}
