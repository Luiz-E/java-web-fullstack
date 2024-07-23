package org.example.src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DatasJava {
    public static void main(String[] args) {

//        LocalDate dataBase = LocalDate.now();
//        System.out.println(dataBase.plusDays(5));
//        System.out.println(dataBase.plusYears(2));
//        System.out.println(dataBase.plusMonths(1));
//        System.out.println(dataBase.plus(4, ChronoUnit.DECADES));
//
//        System.out.println(dataBase.minusDays(5));
//        System.out.println(dataBase.minusMonths(4));
//        System.out.println(dataBase.minusYears(1));
//        System.out.println(dataBase.minus(5, ChronoUnit.CENTURIES));

        LocalDate date = LocalDate.now();
        for (int i = 0; i < 12; i++) {
            System.out.println("Vencimento: " + date.plusMonths(1 + i).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        }
    }
}