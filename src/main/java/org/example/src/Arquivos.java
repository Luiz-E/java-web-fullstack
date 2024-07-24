package org.example.src;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arquivos {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream input =
                new FileInputStream("./src/main/java/org/example/src/arquivo.txt");
        Scanner lerArquivo = new Scanner(input, StandardCharsets.UTF_8);

        List<Pessoa> pessoas = new ArrayList<>();

        while(lerArquivo.hasNext()) {
            String linha = lerArquivo.nextLine();
            if (linha != null && !linha.isEmpty()) {
                String[] dados = linha.split(";");
                Pessoa pessoa = new Pessoa();
                pessoa.setNome(dados[0]);
                pessoa.setEmail(dados[1]);
                pessoa.setIdade(Integer.parseInt(dados[2]));
                pessoas.add(pessoa);
            }
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
        lerArquivo.close();
    }
}
