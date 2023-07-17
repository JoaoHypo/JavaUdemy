package OOB;
import entities.Client;

import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there an initial deposit(y/n)? ");
        String startBalance = sc.nextLine();

        double firstDeposit = 0;
        //coleta termo 0 da string para char
        if ("y".equals(startBalance)){
            System.out.print("Enter initial deposit value: ");
            firstDeposit = sc.nextDouble();
        }
        Client client = new Client(accountNumber,name,firstDeposit);

        System.out.printf("Account data: %n%s:%n%n",client);

        System.out.print("Enter deposit value: ");
        client.deposit(sc.nextDouble());
        sc.nextLine();
        System.out.printf("Updated data: %n%s:%n%n",client);

        System.out.print("Enter withdraw value: ");
        client.withdraw(sc.nextDouble());
        sc.nextLine();
        System.out.printf("Updated data: %n%s:%n%n",client);

        sc.close();
    }
}
