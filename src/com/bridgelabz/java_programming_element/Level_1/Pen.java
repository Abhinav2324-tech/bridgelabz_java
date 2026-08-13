package com.bridgelabz.java_programming_element.Level_1;
/*In this program we calculate the no. of pens per each student and the leftover pens
We use '/' for distribuitedPens & '%' for remainingPens
 */
public class Pen {
    public static void main(String[] args){
        int pens=14;
        int students=3;
        double distributedPens=pens/students;//WE used '/' to calculate no. of pens each student recieve.
        double remainingPens=pens%students;//WE used '%' to calculate the leftover pens
        System.out.println("The Pen Per Student is "+distributedPens+" and the remaining pen not distributed is "+remainingPens);
    }
}
