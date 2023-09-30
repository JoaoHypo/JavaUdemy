package withInterface.application;

import withInterface.entitites.CarRental;
import withInterface.entitites.Vehicle;
import withInterface.services.BrazilTaxService;
import withInterface.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter Car Rental data:");

        System.out.print("Car model: ");
        Vehicle vehicle = new Vehicle(sc.nextLine());

        System.out.print("Check-in date (DD/MM/YYYY HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(),dtf);

        System.out.print("Checkout date (DD/MM/YYYY HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),dtf);

        CarRental carRental = new CarRental(start,finish,vehicle);

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();
        sc.nextLine();

        RentalService rentalService = new RentalService(pricePerHour,pricePerDay,new BrazilTaxService());
        rentalService.processInvoice(carRental);

        System.out.println(carRental.getInvoice());

        sc.close();
    }
}
