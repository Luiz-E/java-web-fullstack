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

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setDisciplina("Banco de Dados");
        disciplina1.setNota(90);

        aluno.getDisciplinas().add(disciplina1);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Matemática");
        disciplina2.setNota(80);

        aluno.getDisciplinas().add(disciplina2);

        Disciplina disciplina3 = new Disciplina();
        disciplina3.setDisciplina("Geográfia");
        disciplina3.setNota(97);

        aluno.getDisciplinas().add(disciplina3);

        Disciplina disciplina4 = new Disciplina();
        disciplina4.setDisciplina("Java Web");
        disciplina4.setNota(70);

        aluno.getDisciplinas().add(disciplina4);

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

        System.out.println(aluno.getMediaNota());

    }
}