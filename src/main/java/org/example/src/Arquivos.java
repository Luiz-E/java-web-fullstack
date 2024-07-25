package org.example.src;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arquivos {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("./src/main/java/org/example/src/arquivo_excel.xls");
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(file);
        HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);

        Iterator<Row> iterator = hssfSheet.iterator();
        List<Pessoa> pessoas = new ArrayList<>();
        while (iterator.hasNext()) {
            Pessoa pessoa = new Pessoa();
            Row linha = iterator.next();
            Iterator<Cell> cellIterator = linha.iterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();

                switch (cell.getColumnIndex()) {
                    case 0:
                        pessoa.setNome(cell.getStringCellValue());
                        break;
                    case 1:
                        pessoa.setEmail(cell.getStringCellValue());
                        break;
                    case 2:
                        pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
                }
            }
            pessoas.add(pessoa);
        }
        file.close();
        System.out.println(pessoas);
    }
}
