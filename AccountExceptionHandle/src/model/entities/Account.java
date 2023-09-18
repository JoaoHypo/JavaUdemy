package model.entities;

import model.exceptions.DomainException;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
     }

     public void withdraw(double amount) throws DomainException{
         if (amount > withdrawLimit) {
             throw new DomainException("Withdraw not allowed, withdraw limit exceed");
         }
        if (amount > balance) {
            throw new DomainException("Withdraw not allowed, balance limit exceed");
        }
        balance-= amount;
     }
}
