package EstructureReview;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeInstance {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now();
        System.out.println(d01);

        LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02);

        Instant d03 = Instant.now();
        System.out.println(d03);

        //                                year - month - day
        LocalDate d04 = LocalDate.parse("2023-08-18");
        System.out.println(d04);

        LocalDateTime d05 = LocalDateTime.parse("2023-08-18T11:21:01");
        System.out.println(d05.toString()); //Returns in ISO 8601 standard
        //Java is implicitly calling tooString whenever we type the object into a sout context

        Instant d06 = Instant.parse("2023-08-18T11:21:01Z"); //Need Z, since it's Instant
        System.out.println(d06);

        //Returns in Z format but corrected time, applying the GMT
        Instant d07 = Instant.parse("2023-08-18T11:21:01-03:00");
        System.out.println(d07);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("12/09/1999",fmt1);
        System.out.println(d08);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("12/09/1999 01:30",fmt2);
        System.out.println(d09);

        //Passing DateTimeFormatter as a parameter
        LocalDateTime d10 = LocalDateTime.parse("21/09/1972 11:11",DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(d10);

        //                           year -  month  -  day
        LocalDate d11 = LocalDate.of(1999, 9, 12);
        System.out.println(d11);

        //                           year -  month  -  day  -  hour  -  minute
        LocalDateTime d12 = LocalDateTime.of(1999, 9, 12,14,14);
        System.out.println(d12);
    }
}
