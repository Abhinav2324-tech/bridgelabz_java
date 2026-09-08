package com.bridgelabz.java_arrays.Level_1;
import java.util.Scanner;
/*
 * This program calculates the mean height of players in a football team.
 * It takes the heights of 11 players as input and stores them in an array.
 * It calculates the sum of all the heights.
 * Finally, it calculates and displays the mean height of the team.
 */
public class FootballTeam {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double[] heights=new double[11];
        double sum=0;
        for(int i=0;i<heights.length;i++){
            System.out.println("Enter the height of the player "+(i+1));
            heights[i]=input.nextDouble();
        }
        for(int i=0;i<heights.length;i++){
            sum+=heights[i];
        }
        double mean=sum/ heights.length;
        System.out.println("The mean height of the football team is: "+mean);
        input.close();
    }

}
