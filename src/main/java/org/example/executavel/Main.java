package org.example.executavel;

import org.example.classes.Aluno;
import org.example.classes.Disciplina;

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

        for (int i = 0; i < 4; i++) {
            String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina?");
            String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina?");
            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(Double.parseDouble(notaDisciplina));
            aluno.getDisciplinas().add(disciplina);
        }

        System.out.println(aluno.getMediaNota());

    }
}