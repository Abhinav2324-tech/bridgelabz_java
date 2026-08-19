package com.bridgelabz.java_methods.Level_2;
import java.util.Scanner;

public class YoungestTallestFriend {
    public int findYoungest(int[] ages){
        int youngestIndex=0;
        for(int i=1;i<ages.length;i++){
            if(ages[i]<youngestIndex){
                youngestIndex=i;
            }
        }
        return youngestIndex;
    }
    public double findTallest(double[] heights){
        int tallestIndex=0;
        for(int i=1;i<heights.length;i++){
            if(heights[i]>tallestIndex){
                tallestIndex=i;
            }
        }
        return tallestIndex;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] names={"Amar","Akbar","Anthony"};
        int[] ages=new int[3];
        double[] heights=new double[3];
        for(int i=0;i<3;i++){
            System.out.println("Enter the ages of "+names[i]+":");
            ages[i]=input.nextInt();
            System.out.println("Enter the heights of "+names[i]+":");
            heights[i]=input.nextDouble();
        }
        YoungestTallestFriend obj=new YoungestTallestFriend();
        int youngestIndex=obj.findYoungest(ages);
        int tallestIndex=(int)obj.findTallest(heights);

        System.out.println("Youngest friend is:"+names[youngestIndex]);
        System.out.println("Tallest friend is:"+names[tallestIndex]);
        input.close();
    }
}
