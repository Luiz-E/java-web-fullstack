package org.example.src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasJava {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("Dia da semana: " + localDate.getDayOfWeek());
        System.out.println("Dia da semana: " + localDate.getDayOfWeek().ordinal());
        System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());

        System.out.println("Dia do mẽs: " + localDate.getDayOfMonth());
        System.out.println("Dia do ano: " + localDate.getDayOfYear());
        System.out.println("Mês: " + localDate.getMonth());
        System.out.println("Mês: " + localDate.getMonthValue());
        System.out.println("Ano: " + localDate.getYear());
    }
}
