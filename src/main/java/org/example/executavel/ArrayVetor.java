package org.example.executavel;

import java.util.Arrays;

public class ArrayVetor {
    public static void main(String[] args) {
        double[] notas = new double[5];
        notas[0] = 7.8;
        notas[1] = 8.7;
        notas[2] = 9.7;
        notas[3] = 9.9;

        System.out.println(notas);
        System.out.println(Arrays.toString(notas));
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota %d: %.2f\n", i+1, notas[i]);
        }
    }
}
