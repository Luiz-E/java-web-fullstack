package org.example.src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DatasJava {
    public static void main(String[] args) throws ParseException {
//        Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("08/04/2024");
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(dataInicial);
//
//        for (int parcela = 1; parcela <= 12; parcela++) {
//            calendar.add(Calendar.MONTH, 1);
//            System.out.println("Parcela número: " + parcela + " vencimento é em: " +
//                    new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
//        }

        LocalDate date = LocalDate.now();
        for (int months = 1; months <= 12; months++) {
            LocalDate nextMonth = date.plusMonths(months);
            System.out.println("Parcela número: " + months + " vencimento é em: " + nextMonth);
        }
    }
}
