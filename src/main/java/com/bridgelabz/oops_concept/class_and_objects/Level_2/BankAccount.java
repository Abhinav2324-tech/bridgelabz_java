package com.bridgelabz.oops_concept.class_and_objects.Level_2;
import java.util.Scanner;

public class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;
    public BankAccount(String accountHolder,long accountNumber,double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void deposit(double amount){
        balance=amount+balance;
        System.out.println("Money deposited Successfully");
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("Money withdrawn Successfully");
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public void displayDetails(){
        System.out.println("Account holder name:"+accountHolder);
        System.out.println("Account number:"+accountNumber);
        System.out.println("Account Balance:"+balance);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the account holder name:");
        String name=input.nextLine();
        System.out.println("Enter the account number:");
        long number=input.nextLong();
        System.out.println("Enter the balance:");
        double balance=input.nextDouble();
        BankAccount bank=new BankAccount(name,number,balance);
        bank.displayDetails();
        System.out.println("Enter the money to be deposited:");
        double money=input.nextDouble();
        bank.deposit(money);
        System.out.println("Enter the money to be withdrawn:");
        double moneyWithdraw=input.nextDouble();
        bank.withdraw(moneyWithdraw);
        input.close();
    }
}
