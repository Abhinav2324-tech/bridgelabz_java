package com.bridgelabz.java_methods.Level_3;
import java.util.Scanner;
/*
 * This program generates a six-digit OTP using Math.random().
 * It generates and stores 10 OTP numbers in an array.
 * It checks whether all the generated OTP numbers are unique.
 * Finally, it displays the OTPs and whether they are unique or not.
 */
public class OTPGenerator {
    public static int otpGenerator(){
        int otp=100000+(int)(Math.random()*900000);
        return otp;
    }
    public static boolean areUnique(int[] otpArray){
        for(int i=0;i<otpArray.length;i++){
            for(int j=i+1;j<otpArray.length;j++){
                if(otpArray[i]==otpArray[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpArray=new int[10];
        for(int i=0;i<otpArray.length;i++){
            otpArray[i]=otpGenerator();
        }
        System.out.println("Generated OTP's are: ");
        for(int i=0;i<otpArray.length;i++){
            System.out.println(otpArray[i]);
        }
        OTPGenerator obj=new OTPGenerator();
        boolean result=obj.areUnique(otpArray);
        if(result){
            System.out.println("Generated OTP's are unique.");
        }
        else{
            System.out.println("Generated OTP's are not unique");
        }
    }
}
