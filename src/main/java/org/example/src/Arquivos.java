package org.example.src;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.*;

public class Arquivos {
    public static void main(String[] args) throws IOException {
        File file =  new File("./src/main/java/org/example/src/arquivo_excel.xls");
        FileInputStream fileInput = new FileInputStream(file);
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fileInput);
        HSSFSheet sheet = hssfWorkbook.getSheetAt(0);

        for (Row row : sheet) {
            String valueCell = row.getCell(0).getStringCellValue();
            row.getCell(0).setCellValue(valueCell + " valor gravado na aula.");
        }
        FileOutputStream out = new FileOutputStream(file);
        hssfWorkbook.write(out);
        out.flush();
        out.close();
        fileInput.close();
    }
}
