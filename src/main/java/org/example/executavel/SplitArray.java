package org.example.executavel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        //List<String> valoresList = new ArrayList<>(List.of(valoresArray));
        List<String> valoresList = Arrays.asList(valoresArray);

        for (String valorString : valoresList) {
            System.out.println(valorString);
        }

        String[] conversaoArray = valoresList.toArray(new String[6]);
        System.out.println(Arrays.toString(conversaoArray));

        for (String valorString : conversaoArray) {
            System.out.println(valorString);
        }
    }
}
