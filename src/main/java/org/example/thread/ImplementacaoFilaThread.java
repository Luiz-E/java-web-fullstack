package org.example.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {
    private static final ConcurrentLinkedQueue<FilaThread> pilha_fila = new ConcurrentLinkedQueue<>();

    public static void add(FilaThread filaThread) {
        pilha_fila.add(filaThread);
    }

    @Override
    public void run() {
        System.out.println("Fila rodando");
        while (true) {
            Iterator<FilaThread> iterator = pilha_fila.iterator();
            synchronized (iterator) {
                while (iterator.hasNext()) {
                    FilaThread processo = iterator.next();
                    System.out.println("---------------------------------------");
                    System.out.println("Executando processo: " + processo.getNome());
                    System.out.println("Email: " + processo.getEmail());
                    System.out.println("---------------------------------------");
                    iterator.remove();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
