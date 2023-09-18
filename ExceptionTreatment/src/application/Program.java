package application;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = Reservation.dtf;

        System.out.println("Reservation System: ");

        try{
            System.out.print("Type room number: ");
            int roomNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Type checkin date (DD/MM/YYYY): ");
            LocalDateTime checkin = LocalDate.parse(sc.nextLine(), fmt).atStartOfDay();

            System.out.print("Type checkout date (DD/MM/YYYY): ");
            LocalDateTime checkout = LocalDate.parse(sc.nextLine(), fmt).atStartOfDay();


            Reservation reserva = new Reservation(roomNumber, checkin, checkout);
            System.out.println("Reservation concluded!");
            System.out.println(reserva);
            System.out.println();

            System.out.println("\nUpdating Reservation: ");

            System.out.print("Type checkin date (DD/MM/YYYY): ");
            checkin = LocalDate.parse(sc.nextLine(), fmt).atStartOfDay();

            System.out.print("Type checkout date (DD/MM/YYYY): ");
            checkout = LocalDate.parse(sc.nextLine(), fmt).atStartOfDay();

            reserva.updateDates(checkin, checkout);
            System.out.println(reserva);
        }
        catch (DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e){ //upcasting
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}
