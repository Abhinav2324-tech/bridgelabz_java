package com.bridgelabz.java_regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PhoneValidator {

    public static boolean isValidPhone(String phone) {

        String regex = "^[6-9][0-9]{9}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);

        return matcher.matches();
    }

    public static void main(String[] args) {

        String phone = "9876543210";

        if (isValidPhone(phone)) {
            System.out.println("Valid Phone Number");
        } else {
            System.out.println("Invalid Phone Number");
        }
    }
}