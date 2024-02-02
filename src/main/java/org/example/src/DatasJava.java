package org.example.src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasJava {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        
        System.out.println("Milisegundos: " + date.getTime());
        System.out.println("Dia do mes: " + date.getDate());
        System.out.println("Dia da semana: " + date.getDay());
        System.out.println("Hora do dia: " + date.getHours());
        System.out.println("Minuto da hora: " + date.getMinutes());
        System.out.println("Segundo: " + date.getSeconds());
        System.out.println("Ano: " + date.getYear());
        System.out.println("Ano atual: " + (date.getYear() + 1900));

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(format.format(date));
        format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(format.format(date));
        format = new SimpleDateFormat("yy-MM-dd");
        System.out.println(format.format(date));
        format = new SimpleDateFormat("yy-MMMM-dd");
        System.out.println(format.format(date));
        format = new SimpleDateFormat("yy-MM-dddd");
        System.out.println(format.format(date));
        format = new SimpleDateFormat("yy-MM-dddd HH:mm.s");
        System.out.println(format.format(date));
        System.out.println(format.parse("2025-12-13 15:33.23"));
    }
}
