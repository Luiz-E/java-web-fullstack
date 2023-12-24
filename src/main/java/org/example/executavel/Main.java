package org.example.executavel;

import org.example.classes.Aluno;
import org.example.classes.Diretor;
import org.example.classes.Secretario;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Alex JDev - Treinamento");

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("43243245");

        Secretario secretario = new Secretario();
        secretario.setExperiencia("Administração");

        System.out.println(aluno);
        System.out.println("--------------------------------------------");
        System.out.println(diretor);
        System.out.println("--------------------------------------------");
        System.out.println(secretario);


    }
}