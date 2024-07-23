package org.example.src;


import java.time.LocalDate;
import java.time.Period;

public class DatasJava {
    public static void main(String[] args) {

        LocalDate dataAntiga = LocalDate.of(2011, 2, 3);
        LocalDate dataNova = LocalDate.of(2022, 5, 12);

        System.out.println(dataAntiga.isAfter(dataNova));
        System.out.println(dataAntiga.isBefore(dataNova));
        System.out.println(dataAntiga.isEqual(dataNova));

        System.out.println("---------------------------------------------");
        Period period = Period.between(dataAntiga, dataNova);

        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
        System.out.println("Diferença de " + period.getYears() + " anos, " + period.getMonths() +  " meses e " +  period.getDays() + " dias");
        System.out.println(period.toTotalMonths());
    }
}