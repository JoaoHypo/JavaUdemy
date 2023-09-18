package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account data: ");
        try{
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String holder = sc.nextLine();
            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw Limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number,holder,balance,withdrawLimit);

            System.out.print("Enter ammount to withdraw: ");
            account.withdraw(sc.nextDouble());
            sc.nextLine();

            System.out.println("Withdraw done!");
            System.out.printf("New balance: %.2f%n ",account.getBalance());
        }
        catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }
        sc.close();
    }
}
