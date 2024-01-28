package org.example.executavel;

import java.util.Arrays;

public class SplitArray {
    public static void main(String[] args) {
        String text = "alex, curso java, 80, 70, 90, 89";
        String[] valoresArray = text.split(",");
        System.out.println(Arrays.toString(valoresArray));

        System.out.println("Nome: " + valoresArray[0]);
        System.out.println("Curso: " + valoresArray[1]);
        System.out.println("Nota 1: " + valoresArray[2]);
        System.out.println("Nome 2: " + valoresArray[3]);
        System.out.println("Nota 3: " + valoresArray[4]);
        System.out.println("Nome 4: " + valoresArray[5]);
    }
}
