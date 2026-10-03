package com.bridgelabz.java_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static boolean isValidEmail(String email){
        String regex="^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String email="abhinavgoud2324@gmail.com";
        if(isValidEmail(email)){
            System.out.println("Valid email");
        }
        else{
            System.out.println("Invalid email");
        }
    }
}
