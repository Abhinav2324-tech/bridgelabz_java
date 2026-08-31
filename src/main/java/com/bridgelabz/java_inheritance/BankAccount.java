package com.bridgelabz.java_inheritance;
/*
This program demonstrates hierarchical inheritance using a banking system.
BankAccount is the superclass, while SavingsAccount, CheckingAccount,
and FixedDepositAccount are subclasses. Each subclass inherits common
account details and has its own unique attribute and account type.
*/

import java.util.Scanner;

class BankAccount {

    protected long accountNumber;
    protected double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void displayAccountType() {
        System.out.println("Bank Account");
    }
}

class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(long accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {

    private double withdrawalLimit;

    public CheckingAccount(long accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {

    private int depositPeriod;

    public FixedDepositAccount(long accountNumber, double balance, int depositPeriod) {
        super(accountNumber, balance);
        this.depositPeriod = depositPeriod;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Deposit Period: " + depositPeriod + " years");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Savings Account Number:");
        long savingsNumber = input.nextLong();

        System.out.println("Enter Savings Account Balance:");
        double savingsBalance = input.nextDouble();

        System.out.println("Enter Interest Rate:");
        double interestRate = input.nextDouble();

        System.out.println("Enter Checking Account Number:");
        long checkingNumber = input.nextLong();

        System.out.println("Enter Checking Account Balance:");
        double checkingBalance = input.nextDouble();

        System.out.println("Enter Withdrawal Limit:");
        double withdrawalLimit = input.nextDouble();

        System.out.println("Enter Fixed Deposit Account Number:");
        long fixedNumber = input.nextLong();

        System.out.println("Enter Fixed Deposit Balance:");
        double fixedBalance = input.nextDouble();

        System.out.println("Enter Deposit Period in years:");
        int depositPeriod = input.nextInt();

        BankAccount savings = new SavingsAccount(
                savingsNumber, savingsBalance, interestRate
        );

        BankAccount checking = new CheckingAccount(
                checkingNumber, checkingBalance, withdrawalLimit
        );

        BankAccount fixedDeposit = new FixedDepositAccount(
                fixedNumber, fixedBalance, depositPeriod
        );

        System.out.println("\nSavings Account Details:");
        savings.displayAccountType();
        savings.displayDetails();

        System.out.println("\nChecking Account Details:");
        checking.displayAccountType();
        checking.displayDetails();

        System.out.println("\nFixed Deposit Account Details:");
        fixedDeposit.displayAccountType();
        fixedDeposit.displayDetails();

        input.close();
    }
}
