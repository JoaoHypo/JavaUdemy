package ContractExercise.application;

import ContractExercise.entities.Contract;
import ContractExercise.entities.Installment;
import ContractExercise.services.ContractService;
import ContractExercise.services.PaypalService;

import java.time.LocalDate;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Contract data:");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Date (DD/MM/YYYY): ");
        LocalDate date = LocalDate.parse(sc.nextLine(),Contract.dtf);
        System.out.print("Contract Value: ");
        double totalValue = sc.nextDouble();
        sc.nextLine();
        System.out.print("Number of installments: ");
        int months = sc.nextInt();
        sc.nextLine();

        Contract contract = new Contract(number,date,totalValue);

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, months);

        System.out.println("Installments:");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
