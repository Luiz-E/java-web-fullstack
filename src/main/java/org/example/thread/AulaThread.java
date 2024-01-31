package org.example.thread;

import javax.swing.*;
import java.lang.Thread;
public class AulaThread {

    public static void main(String[] args) {
        Thread rotina1 = new Thread(thread1);
        Thread rotina2 = new Thread(thread2);

        rotina1.start();
        rotina2.start();

        System.out.println("Finalizou o teste.");
        JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário.");
    }

    private static Runnable thread1 = () -> {
        for (int i = 0; i <  10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Executando rotina 1.");
        }
    };
    private static Runnable thread2 = () -> {
        for (int i = 0; i <  10; i++) {
            try {
                Thread.sleep(1300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Executando rotina 2.");
        }
    };
}
