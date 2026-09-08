package com.bridgelabz.java_programming_element.Level_2;

import java.util.Scanner;
/*
 * This program converts temperature from Fahrenheit to Celsius.
 * It takes the temperature in Fahrenheit as input from the user.
 * It calculates the Celsius temperature using the conversion formula.
 * Finally, it displays the converted temperature in Celsius.
 */
public class FarenheitToCelsius {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double farenheit;
        System.out.println("Enter the temperature in farenheit:");
        farenheit=input.nextDouble();
        double celsiusResult=(farenheit-32)*(5.0/9.0);
        System.out.println("The "+farenheit+" farenheit is "+celsiusResult+" celsius");
        input.close();
    }

}
