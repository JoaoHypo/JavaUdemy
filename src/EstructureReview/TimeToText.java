package EstructureReview;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeToText {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2023-08-18");
        LocalDateTime d05 = LocalDateTime.parse("2023-08-18T11:21:01");
        Instant d06 = Instant.parse("2023-08-18T11:21:01Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                                                                                //fixing Instant limitations
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("DO4:");
        System.out.println("D04 = " + d04.format(fmt1));
        System.out.println("D04 = " + fmt1.format(d04));
        System.out.println("D04 = " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(d04));
        System.out.println("D04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("\nDO5:");
        System.out.println("D04 = " + d05.format(fmt1));
        System.out.println("D05 = " + d05.format(fmt2));
        System.out.println("D05 = " + fmt2.format(d05));
        System.out.println("D05 = " + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(d05));
        System.out.println("D05 = " + d05.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

        System.out.println("\nDO6:"); //Instant does not access format
        //So our methods are reduced, we need to call the instance direct from the formatter

        System.out.println();
        System.out.println("D06 = " + fmt3.format(d06));
        System.out.println("D06 = " + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()).format(d06));
        System.out.println("For instant, it prints out already locally adjusted by gmt and time zone method, \nd06 was: 2023-08-18T11:21:01Z");
        System.out.println(d06);
        System.out.println("D06 = " + fmt4.format(d06));
    }
}

