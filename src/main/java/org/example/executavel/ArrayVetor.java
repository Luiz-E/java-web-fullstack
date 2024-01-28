package org.example.executavel;

import org.example.classes.Aluno;
import org.example.classes.Disciplina;

import java.util.Arrays;

public class ArrayVetor {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Alex");
        aluno1.setNomeEscola("JDev Treinamento");

        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Curso de Java");
        double[] notas = {8.8, 9.7, 7.7, 6.8};
        disciplina.setNota(notas);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina(("Lógica de programação"));
        disciplina2.setNota(new double[]{4,8,9,7});

        aluno1.getDisciplinas().add(disciplina);
        aluno1.getDisciplinas().add(disciplina2);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Alex");
        aluno2.setNomeEscola("JDev Treinamento");

        Disciplina disciplina3 = new Disciplina();
        disciplina3.setDisciplina("Curso de Java");
        double[] notas2 = {8.8, 9.7, 7.7, 6.8};
        disciplina3.setNota(notas2);

        Disciplina disciplina4 = new Disciplina();
        disciplina4.setDisciplina(("Lógica de programação"));
        disciplina4.setNota(new double[]{4,8,9,7});

        aluno2.getDisciplinas().add(disciplina3);
        aluno2.getDisciplinas().add(disciplina4);

        Aluno[] alunosArray = new Aluno[2];
        alunosArray[0] = aluno1;
        alunosArray[1] = aluno2;

        for (Aluno aluno : alunosArray) {
            System.out.println("Nome do aluno: " + aluno.getNome());
            for (Disciplina disc : aluno.getDisciplinas()) {
                System.out.println("Nome da disciplina: " + disc.getDisciplina());
                for (double nota : disc.getNota()) {
                    System.out.println("Nota: " + nota);
                }
            }
        }
    }
}
