package org.example.src;

import java.util.Date;

public class DatasJava {
    public static void main(String[] args) {
        Date date = new Date();
        
        System.out.println("Milisegundos: " + date.getTime());
        System.out.println("Dia do mes: " + date.getDate());
        System.out.println("Dia da semana: " + date.getDay());
        System.out.println("Hora do dia: " + date.getHours());
        System.out.println("Minuto da hora: " + date.getMinutes());
        System.out.println("Segundo: " + date.getSeconds());
        System.out.println("Ano: " + date.getYear());
        System.out.println("Ano atual: " + (date.getYear() + 1900));
    }
}
