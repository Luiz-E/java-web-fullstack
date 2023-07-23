package org.example.executavel;

import org.example.classes.Aluno;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
        String idade = JOptionPane.showInputDialog("Qual a idade?");
        String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
        String rg = JOptionPane.showInputDialog("Qual o RG?");
        String cpf = JOptionPane.showInputDialog("Qual o cpf?");
        String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe?");
        String nomePai = JOptionPane.showInputDialog("Qual o nome do pai");
        String dataMatricula = JOptionPane.showInputDialog("Qual a data da matrícula?");
        String serie = JOptionPane.showInputDialog("Qual a serie?");
        String escola = JOptionPane.showInputDialog("Qual a escola?");
        String nota1 = JOptionPane.showInputDialog("Qual a nota 1?");
        String nota2 = JOptionPane.showInputDialog("Qual a nota 2?");
        String nota3 = JOptionPane.showInputDialog("Qual a nota 3?");
        String nota4 = JOptionPane.showInputDialog("Qual a nota 4?");

        aluno1.setNome(nome);
        aluno1.setIdade(Integer.parseInt(idade));
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistroGeral(rg);
        aluno1.setNumeroCpf(cpf);
        aluno1.setNomeMae(nomeMae);
        aluno1.setNomeMae(nomePai);
        aluno1.setDataMatricula(dataMatricula);
        aluno1.setSerieMatriculado(serie);
        aluno1.setNomeEscola(escola);

        aluno1.setNota1(Double.parseDouble(nota1));
        aluno1.setNota2(Double.parseDouble(nota2));
        aluno1.setNota3(Double.parseDouble(nota3));
        aluno1.setNota4(Double.parseDouble(nota4));

        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Data de nascimento: " + aluno1.getDataNascimento());
        System.out.println("Media: " + aluno1.getMediaNota());
        System.out.println(aluno1.getAlunoAprovado2());


    }
}