package OOB;

import entities.CurrencyConverter;

import java.util.Scanner;

public class DollarBuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("How many dollars will be bought? ");
        double many = sc.nextDouble();
        sc.nextLine();

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.buy(price,many));

        sc.close();
    }
}
