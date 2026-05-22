package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20"); //O Parse ele mostra a forma que será exibida
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // o instant ele deixa no padrao ISO
        LocalDateTime d99 = LocalDateTime.now(); //O now pega a data do meu pc e a hora tambem

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //formatador para dizer como será exibido na tela
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault()); // adicionando o zone id do computador
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;//formatando com o padrao iso date time
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT; //formatando com o iso instant, coloca até o Z de londres pq é instant

        System.out.println("d04 = " + d04.format(fmt1));//exibe na tela com o format. e passando o formatador
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d05 = " + d05.format(fmt4));

        System.out.println("d06 = " + fmt3.format(d06));
        System.out.println("d06 = " + fmt5.format(d06));
        System.out.println("d06 = " + fmt5.format(d06));


        System.out.println(d99.format(fmt2));

    }
}
