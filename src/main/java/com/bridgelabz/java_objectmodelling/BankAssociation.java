package com.bridgelabz.java_objectmodelling;
import java.util.*;

class Account {
    int accountNumber;
    double balance;
    Bank bank;

    Account(int accountNumber, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }
}

class Bank {
    String name;
    int nextAccountNumber = 1001;

    Bank(String name) {
        this.name = name;
    }

    Account openAccount(Customer customer, double amount) {
        Account account = new Account(
                nextAccountNumber++, amount, this
        );

        customer.accounts.add(account);

        System.out.println("Account opened in " + name);
        return account;
    }
}

class Customer {
    String name;
    ArrayList<Account> accounts = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void viewBalance() {
        System.out.println("Customer: " + name);

        for (Account account : accounts) {
            System.out.println(
                    account.bank.name + " | Account: " +
                            account.accountNumber +
                            " | Balance: " + account.balance
            );
        }
    }
}

public class BankAssociation {
    public static void main(String[] args) {

        Bank bank1 = new Bank("SBI");
        Bank bank2 = new Bank("HDFC");

        Customer c1 = new Customer("Rahul");

        bank1.openAccount(c1, 5000);
        bank1.openAccount(c1, 10000);
        bank2.openAccount(c1, 20000);

        c1.viewBalance();
    }
}
