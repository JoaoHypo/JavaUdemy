package noInterface;

import noInterface.entitites.CarRental;
import noInterface.entitites.Invoice;
import noInterface.entitites.Vehicle;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CarRentalMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter Car Rental data:");

        System.out.print("Car model: ");
        Vehicle vehicle = new Vehicle(sc.nextLine());

        System.out.print("Checkin date (DD/MM/YYYY HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(),dtf);

        System.out.print("Checkout date (DD/MM/YYYY HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),dtf);

        CarRental carRental = new CarRental(start,finish,vehicle);

        Duration duration = Duration.between(carRental.getStart(), carRental.getFinish());

        System.out.print("Enter price per hour: ");
        double priceHour = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter price per day: ");
        double priceDay = sc.nextDouble();
        sc.nextLine();

        double basicPayment;

        if (duration.toHours() > 12){
            if(duration.toHours()%24 != 0){
                basicPayment = ((double) duration.toDaysPart() + 1.0) * priceDay ;
            }
            else{
                basicPayment = ((double) duration.toDaysPart()) * priceDay ;
            }
        }
        else{
            basicPayment = duration.toHours() * priceHour;
        }

        Double tax = basicPayment > 100.0 ? basicPayment * 0.15 : basicPayment * 0.2 ;

        Invoice invoice = new Invoice(basicPayment,tax);

        carRental.setInvoice(invoice);

        System.out.println(carRental.getInvoice());

        sc.close();
    }
}
