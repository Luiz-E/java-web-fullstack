package org.example.executavel;

import java.util.Arrays;

public class Matriz {
    public static void main(String[] args) {
        double[][] notasTotal = new double[2][3];
        notasTotal[0][0] = 80;
        notasTotal[0][1] = 90;
        notasTotal[0][2] = 70;

        notasTotal[1][0] = 60;
        notasTotal[1][1] = 85;
        notasTotal[1][2] = 90;

//        Arrays.stream(notas).forEach(listaNotas -> {
//            System.out.println("Notas:");
//            // Método 1
//         //   Arrays.stream(listaNotas).forEach(System.out::println);
//            // Método 2
//            System.out.println(Arrays.toString(listaNotas));
//        });

//        for (double[] notasDisciplina : notasTotal) {
//            System.out.println(notasDisciplina);
//            System.out.println("Disciplina: ");
//            for (double nota : notasDisciplina) {
//                System.out.println(nota);
//            }
//        }

        for (int linha = 0; linha < notasTotal.length; linha++) {
            for (int coluna = 0; coluna < notasTotal[linha].length; coluna++) {
                System.out.printf("Valor na posição [%d][%d]: %.2f%n", linha, coluna, notasTotal[linha][coluna]);
            }
            System.out.println("-".repeat(30));
        }
    }
}
