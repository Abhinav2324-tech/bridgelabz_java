package com.bridgelabz.java_methods.Level_2;
import java.util.Scanner;

public class NumberCheck {
    public boolean isPositive(int number){
        return number>=0;
    }
    public boolean isEven(int number){
        return number%2==0;
    }
    public int compare(int number1,int number2){
        if(number1>number2) {
            return 1;
        }
        else if(number1==number2){
            return 0;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int[] numbers=new int[5];
for(int i=0;i<numbers.length;i++){
    System.out.println("Enter the number "+(i+1)+":");
    numbers[i]=input.nextInt();
}
NumberCheck obj=new NumberCheck();
for(int i=0;i<numbers.length;i++) {
    if (obj.isPositive(numbers[i])) {
if(obj.isEven(numbers[i])){
    System.out.println(numbers[i]+" is positive and even");
}
else{
    System.out.println(numbers[i]+" is positive and odd");
}
    }
    else{
        System.out.println(numbers[i]+" is neagtive");
    }
}
int result=obj.compare(numbers[0],numbers[numbers.length-1]);
if(result==1){
    System.out.println("First element is greater than last element");
}
else if(result==0){
            System.out.println("First element and last element are equal");
        }
else{
    System.out.println("First element is less than last element");
}
input.close();
    }
}
