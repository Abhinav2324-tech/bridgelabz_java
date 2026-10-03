package com.bridgelabz.java_regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!])\\S{8,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }

    public static void main(String[] args) {

        String password = "abghAGH#$%12g";

        if (isValidPassword(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
