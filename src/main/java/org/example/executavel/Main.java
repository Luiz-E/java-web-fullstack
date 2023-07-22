package org.example.executavel;

import org.example.classes.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        System.out.println("Nome: " + aluno1.nome);

        //aluno1.idade;

        Aluno aluno2 = null;
        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno("Maria");
        Aluno aluno5 = new Aluno("José", 50);
    }
}