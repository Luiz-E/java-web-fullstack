package org.example.src;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;

public class Arquivos {
    public static void main(String[] args) throws IOException {
        File file =  new File("./src/main/java/org/example/src/arquivo_excel.xls");
        FileInputStream fileInput = new FileInputStream(file);
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fileInput);
        HSSFSheet sheet = hssfWorkbook.getSheetAt(0);

        for (Row row : sheet) {
            int cellNumber = row.getPhysicalNumberOfCells();
            Cell cell = row.createCell(cellNumber);
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira o salário: ");
            double salario = sc.nextDouble();
            cell.setCellValue(salario);
        }
        FileOutputStream out = new FileOutputStream(file);
        hssfWorkbook.write(out);
        out.flush();
        out.close();
        fileInput.close();
    }
}
