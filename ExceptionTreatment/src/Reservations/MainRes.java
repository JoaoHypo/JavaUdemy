package Reservations;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainRes {
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

        Reservation reserva = new Reservation(roomNumber,checkin,checkout);
        System.out.println("Reservation concluded!");
        System.out.println(reserva.toString());

        System.out.println("\nUpdating Reservation: ");

        System.out.print("Type checkin date (DD/MM/YYYY): ");
        LocalDateTime checkin2 = LocalDate.parse(sc.nextLine(),fmt).atStartOfDay();

        System.out.print("Type checkout date (DD/MM/YYYY): ");
        LocalDateTime checkout2 = LocalDate.parse(sc.nextLine(),fmt).atStartOfDay();

        reserva.updateDates(checkin2,checkout2);

        System.out.println("Reservation update concluded!");
        System.out.println(reserva.toString());

        sc.close();
    }
}
