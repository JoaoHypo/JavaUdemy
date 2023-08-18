package EstructureReview;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalToGlobalTime {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2023-08-18");
        LocalDateTime d05 = LocalDateTime.parse("2023-08-18T11:21:01");
        Instant d06 = Instant.parse("2023-08-18T01:21:01Z");

/*        for (String s : ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }*/

        //getting LocalDate from Instant with local pc parameter
        LocalDate r1 = LocalDate.ofInstant(d06,ZoneId.systemDefault());
        System.out.println("R1 = "+r1);

        //getting LocalDate from Instant with local pc parameter
        LocalDate r2 = LocalDate.ofInstant(d06,ZoneId.of("Portugal"));
        System.out.println("R2 = "+r2);

        //getting LocalDate from Instant with local pc parameter
        LocalDateTime r3 = LocalDateTime.ofInstant(d06,ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06,ZoneId.of("Portugal"));
        System.out.println("R3 = "+r3);
        System.out.println("R4 = "+r4);

        System.out.println("Dia D04 = " + d04.getDayOfMonth());
        System.out.println("Mês D04 = " + d04.getMonthValue());
        System.out.println("Ano D04 = " + d04.getYear());

        System.out.println("Hora D05 = " + d05.getHour() + ":" +d05.getMinute() );

    }
}
