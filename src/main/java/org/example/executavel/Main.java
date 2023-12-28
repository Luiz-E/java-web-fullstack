package org.example.executavel;

import org.example.classes.Aluno;
import org.example.classes.Diretor;
import org.example.classes.Pessoa;
import org.example.classes.Secretario;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Alex JDev - Trei namento");
        aluno.setIdade(16);

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("43243245");
        diretor.setIdade(50);

        Secretario secretario = new Secretario();
        secretario.setExperiencia("Administração");
        secretario.setIdade(18);

//        System.out.println(aluno);
//        System.out.println("--------------------------------------------");
//        System.out.println(diretor);
//        System.out.println("--------------------------------------------");
//        System.out.println(secretario);

        System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
        diretor.pessoaMaiorIdade();
        secretario.pessoaMaiorIdade();

        //Pessoa pessoa = new Pessoa();
    }
}