package com.bridgelabz.java_constructors.Level_2;

/*
This program demonstrates access modifiers using a BankAccount class.
The accountNumber is public, accountHolder is protected, and balance
is private. The SavingsAccount subclass directly accesses public and
protected members, while getter and setter methods access the balance.
*/

import java.util.Scanner;

class BankAccount {

    public long accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(long accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter account number:");
        long accountNumber = input.nextLong();
        input.nextLine();

        System.out.println("Enter account holder name:");
        String accountHolder = input.nextLine();

        System.out.println("Enter balance:");
        double balance = input.nextDouble();

        SavingsAccount account =
                new SavingsAccount(accountNumber, accountHolder, balance);

        account.displayDetails();

        System.out.println("Enter new balance:");
        double newBalance = input.nextDouble();

        account.setBalance(newBalance);

        System.out.println("Updated Balance: " + account.getBalance());

        input.close();
    }
}