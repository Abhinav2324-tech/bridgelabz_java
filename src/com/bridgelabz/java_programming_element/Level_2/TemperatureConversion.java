package com.bridgelabz.java_programming_element.Level_2;
import java.util.Scanner;
/*
 * This program converts temperature from Celsius to Fahrenheit.
 * It takes the temperature in Celsius as input from the user.
 * It calculates the Fahrenheit temperature using the conversion formula.
 * Finally, it displays the converted temperature in Fahrenheit.
 */
public class TemperatureConversion {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double celsius;
        System.out.println("Enter the temperature in celsius:");
        celsius=input.nextDouble();
        double farenheitResult=(celsius*(9.0/5.0))+32;
        System.out.println("The "+celsius+" celsius is "+farenheitResult+" farenheit");
        input.close();
    }

}
