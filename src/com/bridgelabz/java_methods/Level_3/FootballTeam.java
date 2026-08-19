package com.bridgelabz.java_methods.Level_3;
import java.util.Scanner;

public class FootballTeam {
    public int findSum(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }

    public double findMean(int[] heights) {
        double mean = (double) findSum(heights) / heights.length;
        return mean;
    }

    public int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }
        return shortest;
    }

    public int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int) (Math.random() * 101);
        }
        FootballTeam obj = new FootballTeam();
        int sum = obj.findSum(heights);
        double mean = obj.findMean(heights);
        int shortest = obj.findShortest(heights);
        int tallest = obj.findTallest(heights);
        System.out.println("The heights of the players are:");
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Payer " + (i + 1) + ":" + heights[i] + " cm");
        }
        System.out.println("The sum of player heights is: " + sum);
        System.out.println("The mean of player heights is: " + mean);
        System.out.println("The shortest player is: " + shortest);
        System.out.println("The tallest palyer is: " + tallest);
    }
}