package org.example.src;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatasJava {
    public static void main(String[] args){
        long dias = ChronoUnit.DAYS.between(LocalDate.parse("2024-07-21"), LocalDate.now());
        long semanas = ChronoUnit.WEEKS.between(LocalDate.parse("2024-07-21"), LocalDate.now());
        long anoDias = ChronoUnit.YEARS.between(LocalDate.parse("2025-02-04"), LocalDate.now());
        System.out.println(dias);
        System.out.println(semanas);
        System.out.println(anoDias);
    }
}
