package com.bridgelabz.java_keywords;
import java.util.Scanner;

class BankAccount {
    private String accountHolderName;
    private final long accountNumber;
    private static String bankName="SBI";
    private static int totalAccounts=0;
    public BankAccount(String accountHolderName,long accountNumber){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        totalAccounts++;
    }
    public static void getTotalAccounts(){
        System.out.println("Total Accounts:"+totalAccounts);
    }
    public void displayDetails(){
        System.out.println("Bank Name:"+bankName);
        System.out.println("Account Holder Name:"+accountHolderName);
        System.out.println("Account number:"+accountNumber);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account holder name:");
        String name=input.nextLine();
        System.out.println("Enter account number:");
        long accountNumber=input.nextLong();
        BankAccount account=new BankAccount(name,accountNumber);
        BankAccount account1=new BankAccount(name,accountNumber);
        if(account instanceof BankAccount){
            account.displayDetails();
            account1.displayDetails();
        }
        BankAccount.getTotalAccounts();
        input.close();
    }
}
