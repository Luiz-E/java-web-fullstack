package org.example.src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasJava {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dataVencimentoBoleto = simpleDateFormat.parse("10/03/2024");
        Date dataAtual = simpleDateFormat.parse("11/03/2024");
//        if (dataVencimentoBoleto.after(dataAtual)) {
//            System.out.println("Não venceu");
//        } else {
//            System.out.println("Venceu");
//        }

        if (dataVencimentoBoleto.before(dataAtual)) {
            System.out.println("Venceu");
        } else {
            System.out.println("Não venceu");
        }
    }
}
