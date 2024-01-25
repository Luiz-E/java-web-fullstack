package org.example.executavel;

import javax.swing.*;
import java.util.Arrays;

public class ArrayVetor {
    public static void main(String[] args) {

        String posicoes = JOptionPane.showInputDialog("Quantas posiçẽos o array deve ter?");
        double[] notas = new double[Integer.parseInt(posicoes)];

        for (int i = 0; i < notas.length; i++) {
            String valor = JOptionPane.showInputDialog("Qual o valor da posição %d?".formatted(i+1));
            notas[i] = Double.parseDouble(valor);
        }

        System.out.println(notas);
        System.out.println(Arrays.toString(notas));
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota %d: %.2f\n", i+1, notas[i]);
        }
    }
}
