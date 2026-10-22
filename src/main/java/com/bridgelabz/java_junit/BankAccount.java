package com.bridgelabz.java_junit;

public class BankAccount {
    private double balance;
    public BankAccount(double balance){
        this.balance=balance;
    }
   public void deposit(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Invalid deposit amount");
        }
        balance=amount+balance;
   }
   public void withdraw(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Invalid withdraw amount");
        }
        if(amount>balance){
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance=balance-amount;
   }
   public double getBalance(){
        return balance;
   }
}
