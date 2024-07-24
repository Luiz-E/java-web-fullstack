package org.example.src;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

        File arquivo = new File("./src/main/java/org/example/src/arquivo.txt");
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        FileWriter writer = new FileWriter(arquivo);

        for (Pessoa p : pessoas) {
            writer.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade() + "\n");
        }
        writer.flush();
        writer.close();

    }
}
