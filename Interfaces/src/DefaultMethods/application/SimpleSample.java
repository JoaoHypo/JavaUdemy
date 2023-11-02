package DefaultMethods.application;

import DefaultMethods.services.BrazilInterestService;
import DefaultMethods.services.InterestService;
import DefaultMethods.services.UsaInterestService;

import java.util.Scanner;

public class SimpleSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();
        System.out.print("Months: ");
        int months = sc.nextInt();
        sc.nextLine();

        InterestService is = new BrazilInterestService(1.0);
        double payment = is.payment(amount,months);

        System.out.println("Payment after " + months + " months");
        System.out.printf("%.2f",payment);


    }
}
