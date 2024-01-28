package org.example.executavel;

import org.example.classes.Aluno;
import org.example.classes.Disciplina;

import java.util.Arrays;

public class ArrayVetor {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Alex");
        aluno.setNomeEscola("JDev Treinamento");

        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Curso de Java");
        double[] notas = {8.8, 9.7, 7.7, 6.8};
        disciplina.setNota(notas);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina(("Lógica de programação"));
        disciplina2.setNota(new double[]{4,8,9,7});

        aluno.getDisciplinas().add(disciplina);
        aluno.getDisciplinas().add(disciplina2);

        System.out.printf("Aluno: %s, inscrito no curso: %s%n", aluno.getNome(), aluno.getNomeEscola());
        for (Disciplina disc : aluno.getDisciplinas()) {
            System.out.println("---------- Disciplina ----------");
            System.out.printf("Disciplina: %s%n", disc.getDisciplina());
            //System.out.printf("Notas: %s%n", Arrays.toString(disc.getNota()).replace(",", " -").replaceAll("[\\[\\]]", ""));
            //System.out.printf("Maior nota da disciplina %s é: %.2f%n", disc.getDisciplina(), Arrays.stream(disc.getNota()).max().orElse(0));
            //System.out.printf("Menor nota da disciplina %s é: %.2f%n", disc.getDisciplina(), Arrays.stream(disc.getNota()).min().orElse(0));
            System.out.print("Notas: ");

            for (int i = 0; i < disc.getNota().length; i++) {
                System.out.print(disc.getNota()[i]);
                if (i != disc.getNota().length - 1) {
                    System.out.print(" - ");
                } else {
                    System.out.println();
                }
            }
            double notaMaxima = disc.getNota()[0];
            for (double nota : disc.getNota()) {
                if (nota > notaMaxima) {
                    notaMaxima = nota;
                }
            }
            System.out.println("A maior nota da discipilina " + disc.getDisciplina() + " é: " + notaMaxima);
            double notaMinima = disc.getNota()[0];
            for (int i = 0; i < disc.getNota().length; i++) {
                for (double nota : disc.getNota()) {
                    if (nota < notaMinima) {
                        notaMinima = nota;
                    }
                }
            }
            System.out.println("A menor nota da discipilina " + disc.getDisciplina() + " é: " + notaMinima);
        }
        System.out.println("--------------------------------");
    }
}
