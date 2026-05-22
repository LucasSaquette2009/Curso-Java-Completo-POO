package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime d04 = LocalDateTime.now();
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        DateTimeFormatter fmt1 = DateTimeFormatter.ISO_DATE_TIME;

        System.out.println("R1 =" + r1);
        System.out.println("R2 =" + r2);
        System.out.println("R3 =" + r3);
        System.out.println("R4 =" + r4);

        System.out.println("D04 dia = " + d04.getDayOfMonth());
        System.out.println("D04 mês = " + d04.getMonthValue());
        System.out.println("D04 ano = " + d04.getYear());

        System.out.println("D04 hora = " + d04.format(fmt1));
        System.out.println("D05 hora = " + d05.getMinute());
        System.out.println("D05 hora = " + d05.getSecond());

    }
}
