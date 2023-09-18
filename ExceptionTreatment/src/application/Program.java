package application;

import model.entities.Reservation;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = Reservation.dtf;

        System.out.println("Reservation System: ");
        System.out.print("Type room number: ");
        int roomNumber =sc.nextInt();
        sc.nextLine();

        System.out.print("Type checkin date (DD/MM/YYYY): ");
        LocalDateTime checkin = LocalDate.parse(sc.nextLine(),fmt).atStartOfDay();

        System.out.print("Type checkout date (DD/MM/YYYY): ");
        LocalDateTime checkout = LocalDate.parse(sc.nextLine(),fmt).atStartOfDay();

        if (!checkout.isAfter(checkin)){
            System.out.println("Error in reservation: Check-out date must be after check-in date!");
        }
        else {
            Reservation reserva = new Reservation(roomNumber,checkin,checkout);
            System.out.println("Reservation concluded!");
            System.out.println(reserva.toString());
            System.out.println();

            System.out.println("\nUpdating Reservation: ");

            System.out.print("Type checkin date (DD/MM/YYYY): ");
            checkin = LocalDate.parse(sc.nextLine(),fmt).atStartOfDay();

            System.out.print("Type checkout date (DD/MM/YYYY): ");
            checkout = LocalDate.parse(sc.nextLine(),fmt).atStartOfDay();

            LocalDateTime now = LocalDateTime.now();
            if (checkin.isBefore(now) || checkout.isBefore(now)){
                System.out.println("Error in reservation: Reservation dates for update must be future dates!");
            }
            else if (!checkout.isAfter(checkin)){
                System.out.println("Error in reservation: Check-out date must be after check-in date!");
            }
            else {
                reserva.updateDates(checkin,checkout);
                System.out.println("Reservation update concluded!");
                System.out.println(reserva.toString());
            }
        }
        sc.close();
    }
}
