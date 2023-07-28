package org.example.executavel;

import org.example.classes.Aluno;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
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

        String disciplina1 = JOptionPane.showInputDialog("Qual a disciplina 1?");
        String nota1 = JOptionPane.showInputDialog("Qual a nota 1?");
        String disciplina2 = JOptionPane.showInputDialog("Qual a disciplina 2?");
        String nota2 = JOptionPane.showInputDialog("Qual a nota 2?");
        String disciplina3 = JOptionPane.showInputDialog("Qual a disciplina 3?");
        String nota3 = JOptionPane.showInputDialog("Qual a nota 3?");
        String disciplina4 = JOptionPane.showInputDialog("Qual a disciplina 4?");
        String nota4 = JOptionPane.showInputDialog("Qual a nota 4?");

        aluno.setNome(nome);
        aluno.setIdade(Integer.parseInt(idade));
        aluno.setDataNascimento(dataNascimento);
        aluno.setRegistroGeral(rg);
        aluno.setNumeroCpf(cpf);
        aluno.setNomeMae(nomeMae);
        aluno.setNomeMae(nomePai);
        aluno.setDataMatricula(dataMatricula);
        aluno.setSerieMatriculado(serie);
        aluno.setNomeEscola(escola);

        aluno.getDisciplina().setNota1(Double.parseDouble(nota1));
        aluno.getDisciplina().setNota2(Double.parseDouble(nota2));
        aluno.getDisciplina().setNota3(Double.parseDouble(nota3));
        aluno.getDisciplina().setNota4(Double.parseDouble(nota4));
        aluno.getDisciplina().setDisciplina1(disciplina1);
        aluno.getDisciplina().setDisciplina2(disciplina2);
        aluno.getDisciplina().setDisciplina3(disciplina3);
        aluno.getDisciplina().setDisciplina4(disciplina4);

    }
}