package org.example.src;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatasJava {
    public static void main(String[] args) {

        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual: " + dataAtual);

        LocalTime horaAtual = LocalTime.now();
        System.out.println("Hora atual: " + horaAtual);

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Data e hora: "  + dataHoraAtual);
    }
}
