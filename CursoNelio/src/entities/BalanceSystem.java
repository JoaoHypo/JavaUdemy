package entities;

public class BalanceSystem {
    public static double deposit(double balance, double deposit){
        return balance+deposit;
    }
    public static double withdraw(double balance, double withdraw){
        return balance - 5 - withdraw;
    }
}
