package estudo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public static void main (String[] args) {

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        LocalDate d04 = LocalDate.parse("2023-07-19");
        LocalDateTime d05 = LocalDateTime.parse("2023-07-19T01:30:45");
        Instant d06 = Instant.parse("2023-07-19T01:30:45Z");

        System.out.println("d04 = "+ d04.format(fmt1));
        System.out.println("d04 fmt1 = "+ fmt1.format(d04));
        System.out.println("d04 DateTimeFormatter = "+ d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d05 fmt1 = "+ d05.format(fmt1));
        System.out.println("d05 fmt2 = "+ d05.format(fmt2));
        System.out.println("d05 fmt3 = "+ d05.format(fmt3));
        System.out.println("d05 fmt4 = "+ d05.format(fmt4));
        System.out.println("d06 = "+ d06);

        System.out.println("d06 fmt3 = "+ fmt3.format(d06));
        System.out.println("d06 fmt5 = "+ fmt5.format(d06));


    }
}

