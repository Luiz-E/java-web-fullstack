package org.example.src;

import java.time.Duration;
import java.time.Instant;

public class DatasJava {
    public static void main(String[] args) throws InterruptedException {
        Instant inicio = Instant.now();

        Thread.sleep(2000);
        Instant iFinal = Instant.now();

        Duration duracao = Duration.between(inicio, iFinal);
        System.out.println("Duração: " + duracao);
        System.out.println("Duração em nanossegundos: " + duracao.toNanos());
        System.out.println("Duração em minutos: " + duracao.toMinutes());
        System.out.println("Duração em horas: " + duracao.toHours());
        System.out.println("Duração em dias: " + duracao.toDays());
        System.out.println("Duração em segundos: " + duracao.toSeconds());
        System.out.println("Duração em milisegundos: " + duracao.toMillis());
    }
}