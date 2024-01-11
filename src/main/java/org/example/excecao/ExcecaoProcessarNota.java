package org.example.excecao;

public class ExcecaoProcessarNota extends Exception{

     public ExcecaoProcessarNota(String message) {
         super("deu ruim no processo das notas " + message);
     }

}
