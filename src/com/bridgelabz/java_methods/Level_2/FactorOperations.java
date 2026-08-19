package com.bridgelabz.java_methods.Level_2;
import java.util.Scanner;

public class FactorOperations {
    public static int[] findFactors(int number){
        int count=0;
        for(int i=1;i<=number;i++){
            if(number%i==0)
                    count++;
        }
        int[] factors=new int[count];
        int index=0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                factors[index]=i;
                index++;
            }
        }
        return factors;
    }
    public static int sumOfArray(int[] factors){
        int sum=0;
        for(int i=0;i<factors.length;i++){
            sum +=factors[i];
        }
        return sum;
    }
    public static int findProduct(int[] factors){
        int product=1;
        for(int i=0;i<factors.length;i++){
            product*=factors[i];
        }
        return product;
    }
    public static double sumOfSquares(int[] factors){
        double sumOfSquares=0;
        for(int i=0;i<factors.length;i++){
            sumOfSquares=sumOfSquares+Math.pow(factors[i],2);
        }
        return  sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=input.nextInt();
        FactorOperations obj=new FactorOperations();
        int[] factors=obj.findFactors(number);
        System.out.println("Factors are: ");
        for(int i=0;i<factors.length;i++){
            System.out.println(factors[i]);
        }
        int sum=obj.sumOfArray(factors);
        int product=obj.findProduct(factors);
        double squares=(int)obj.sumOfSquares(factors);
        System.out.println("Sum of factors= "+sum);
        System.out.println("Product of factors= "+product);
        System.out.println("Sum of Squares= "+squares);
        input.close();
    }
}
