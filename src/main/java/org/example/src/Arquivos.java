package org.example.src;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/main/java/org/example/src/arquivo_excel.xls");
        if (!file.exists()) {
            file.createNewFile();
        }

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

        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        HSSFSheet linhasPessoas = hssfWorkbook.createSheet("Planilha de pessoas JDev Treinamento");

        int numeroLinha = 0;
        for (Pessoa pessoa : pessoas) {
            Row row = linhasPessoas.createRow(numeroLinha++);

            int numeroCell = 0;

            Cell cellNome = row.createCell(numeroCell++);
            cellNome.setCellValue(pessoa.getNome());

            Cell cellEmail = row.createCell(numeroCell++);
            cellEmail.setCellValue(pessoa.getEmail());

            Cell cellIdade = row.createCell(numeroCell);
            cellIdade.setCellValue(pessoa.getIdade());
        }

        FileOutputStream saida = new FileOutputStream(file);
        hssfWorkbook.write(saida);
        saida.flush();
        saida.close();
        System.out.println("Planilha criada. ");
    }
}
