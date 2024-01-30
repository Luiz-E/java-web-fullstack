package org.example.thread;

import javax.swing.*;
import java.lang.Thread;
public class AulaThread {

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i <  10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Executando rotina 1.");
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i <  10; i++) {
                try {
                    Thread.sleep(1300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Executando rotina 2.");
            }
        }).start();

        System.out.println("Finalizou o teste.");
        JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário.");
    }

}
