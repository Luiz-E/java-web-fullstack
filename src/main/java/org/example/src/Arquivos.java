package org.example.src;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arquivos {
    public static void main(String[] args) throws IOException {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setEmail("pessoa1@gmail.com");
        pessoa1.setIdade(50);
        pessoa1.setNome("Alex egidio");
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setEmail("pessoa2@gmail.com");
        pessoa2.setIdade(25);
        pessoa2.setNome("Marcos Tadeu");
        Pessoa pessoa3 = new Pessoa();
        pessoa3.setEmail("pessoa3@gmail.com");
        pessoa3.setIdade(40);
        pessoa3.setNome("Maria Jesus");

        List<Pessoa> pessoas = new ArrayList<>(List.of(pessoa1, pessoa2, pessoa3));

        File arquivo = new File("./src/main/java/org/example/src/arquivo.csv");
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        FileWriter writer = new FileWriter(arquivo);

        for (Pessoa p : pessoas) {
            writer.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade() + "\n");
        }


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

        writer.flush();
        writer.close();
    }
}
