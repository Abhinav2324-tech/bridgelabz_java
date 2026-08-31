package com.bridgelabz.java_abstraction;
/*
This program demonstrates a Banking System using abstraction,
inheritance, encapsulation, interfaces, method overriding,
and polymorphism. SavingsAccount and CurrentAccount calculate
interest differently and also support loan-related operations.
*/

import java.util.Scanner;

interface Loanable {

    void applyForLoan();

    boolean calculateLoanEligibility();
}

abstract class BankAccount implements Loanable {

    private long accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(long accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
    }
}

class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(long accountNumber, String holderName,
                          double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 50000;
    }

    @Override
    public void applyForLoan() {
        if (calculateLoanEligibility()) {
            System.out.println("Savings Account is eligible for loan.");
        } else {
            System.out.println("Savings Account is not eligible for loan.");
        }
    }
}

class CurrentAccount extends BankAccount {

    private double interestRate;

    public CurrentAccount(long accountNumber, String holderName,
                          double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 100000;
    }

    @Override
    public void applyForLoan() {
        if (calculateLoanEligibility()) {
            System.out.println("Current Account is eligible for loan.");
        } else {
            System.out.println("Current Account is not eligible for loan.");
        }
    }




    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Savings Account Number:");
        long savingsAccountNumber = input.nextLong();
        input.nextLine();

        System.out.println("Enter Savings Account Holder Name:");
        String savingsHolderName = input.nextLine();

        System.out.println("Enter Savings Account Balance:");
        double savingsBalance = input.nextDouble();

        System.out.println("Enter Savings Account Interest Rate:");
        double savingsInterestRate = input.nextDouble();

        System.out.println("Enter Current Account Number:");
        long currentAccountNumber = input.nextLong();
        input.nextLine();

        System.out.println("Enter Current Account Holder Name:");
        String currentHolderName = input.nextLine();

        System.out.println("Enter Current Account Balance:");
        double currentBalance = input.nextDouble();

        System.out.println("Enter Current Account Interest Rate:");
        double currentInterestRate = input.nextDouble();

        BankAccount savingsAccount =
                new SavingsAccount(
                        savingsAccountNumber,
                        savingsHolderName,
                        savingsBalance,
                        savingsInterestRate
                );

        BankAccount currentAccount =
                new CurrentAccount(
                        currentAccountNumber,
                        currentHolderName,
                        currentBalance,
                        currentInterestRate
                );

        BankAccount[] accounts = new BankAccount[2];

        accounts[0] = savingsAccount;
        accounts[1] = currentAccount;

        System.out.println("\nBank Account Details");

        for (int i = 0; i < accounts.length; i++) {
            System.out.println();
            accounts[i].displayDetails();
            accounts[i].applyForLoan();
        }

        input.close();
    }
}