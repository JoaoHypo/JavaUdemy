package EstructureReview;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimeOperations {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2023-08-18");
        LocalDateTime d05 = LocalDateTime.parse("2023-08-18T11:21:01");
        Instant d06 = Instant.parse("2023-08-18T01:21:01Z");

        LocalDate PastWeek = d04.minusWeeks(1);
        LocalDate PastWeek1 = d04.minusDays(7);
        LocalDate NextWeek = d04.plusWeeks(1);

        System.out.println("Date Local Date = "+ d04);
        System.out.println("PastWeek-Weeks = "+ PastWeek);
        System.out.println("PastWeek-Days = "+ PastWeek1);
        System.out.println("NextWeek + Weeks = "+ NextWeek);


        LocalDateTime PastWeekLocalDataTime = d05.minusDays(7);
        LocalDateTime NextWeekLocalDataTime = d05.plusWeeks(1);

        System.out.println("\nDate Local Date Time = "+ d05);
        System.out.println("PastWeekLocalDateTime = "+ PastWeekLocalDataTime);
        System.out.println("NextWeekLocalDateTime = "+ NextWeekLocalDataTime);

        Instant PastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant NextWeekInstant = d06.plus(7,ChronoUnit.DAYS);

        System.out.println("\nDate Instant= "+ d06);
        System.out.println("PastWeekInstant = "+ PastWeekInstant);
        System.out.println("NextWeekInstant = "+ NextWeekInstant);

        //Duration - Need to be same time type

        Duration t1 = Duration.between(PastWeekLocalDataTime,d05);
        System.out.println("\nDuration = "+ t1.toDays());

        //Local Date need to be added hours         \/      OR       \/
        Duration t2 = Duration.between(PastWeek.atStartOfDay(),d04.atTime(0,0));
        System.out.println("\nDuration = "+ t2.toDays());

        Duration t3 = Duration.between(PastWeekInstant,d06);
        System.out.println("\nDuration = "+ t3.toDays());

        //Minus result, indicating back in time
        Duration t4 = Duration.between(d06, PastWeekInstant);
        System.out.println("\nDuration = "+ t4.toDays());

    }
}
