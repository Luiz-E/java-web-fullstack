package org.example.executavel;

import javax.swing.*;
import java.util.Arrays;

public class ArrayVetor {
    public static void main(String[] args) {

//        double[] valores = new double[5];
//        double[] valores = {9.5, 8.9, 5.8, 100.8};
        String[] valores = {"alex", "90", "Curso de Java", "contato@jdevtreinamento.com.br"};

        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Valores[%d]: %s%n", i, valores[i]);
        }
    }
}
