package org.example.executavel;

import org.example.classes.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        //aluno1.nome = "João";
        //System.out.println("Nome: " + aluno1.nome);
        aluno1.setNome("João da Silva");
        aluno1.setIdade(50);
        aluno1.setDataNascimento("18/10/1987");
        aluno1.setRegistroGeral("4454.5435.435");
        aluno1.setNumeroCpf("123.453.134-70");
        aluno1.setNomeMae("Shirlei");
        aluno1.setNomeMae("Antonio");
        aluno1.setDataMatricula("10/01/2019");
        aluno1.setSerieMatriculado("5");
        aluno1.setNomeEscola("JDev Treinamento");

        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Data de nascimento: " + aluno1.getDataNascimento());

        //aluno1.idade;

        Aluno aluno2 = null;
        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno("Maria");
        Aluno aluno5 = new Aluno("José", 50);
    }
}