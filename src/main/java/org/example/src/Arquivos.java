package org.example.src;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Arquivos {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream input =
                new FileInputStream("./src/main/java/org/example/src/arquivo.txt");
        Scanner lerArquivo = new Scanner(input, StandardCharsets.UTF_8);
        while(lerArquivo.hasNext()) {
            String linha = lerArquivo.nextLine();
            if (linha != null && !linha.isEmpty()) {
                System.out.println(linha);
            }
        }
        lerArquivo.close();
    }
}
