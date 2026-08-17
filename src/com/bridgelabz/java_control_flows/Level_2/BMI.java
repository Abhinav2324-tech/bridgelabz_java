package com.bridgelabz.java_control_flows.Level_2;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
/*
 * This program calculates the Body Mass Index (BMI) of a person.
 * It takes the weight and height of the person as input from the user.
 * It calculates the BMI using weight and height in metres.
 * It determines the BMI status such as Underweight, Normal, or Overweight.
 * Finally, it displays the BMI value and its corresponding status.
 */
public class BMI {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the weight of the person:");
        double weight=input.nextDouble();
        System.out.println("Enter the height of the person in cm:");
        double heightCm=input.nextDouble();
        double heightMetres=heightCm/100.0;
        double BMI=weight/(heightMetres*heightMetres);
        String status;
        if(BMI<=18.4)
            status="Underweight";
        else if(BMI>=18.5&&BMI<=24.9)
            status="Normal";
        else if(BMI>=25.0&&BMI<=39.9)
            status="Overweight";
        else
            status="Obese";
        System.out.println("BMI: "+BMI+" Status: "+status);
        input.close();
    }
}
