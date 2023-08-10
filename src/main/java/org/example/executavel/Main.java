package org.example.executavel;

import org.example.classes.Aluno;
import org.example.classes.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();

        for (int numeroAlunos = 0; numeroAlunos < 2; numeroAlunos++) {

            Aluno aluno = new Aluno();
            String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
//        String idade = JOptionPane.showInputDialog("Qual a idade?");
//        String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
//        String rg = JOptionPane.showInputDialog("Qual o RG?");
//        String cpf = JOptionPane.showInputDialog("Qual o cpf?");
//        String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe?");
//        String nomePai = JOptionPane.showInputDialog("Qual o nome do pai");
//        String dataMatricula = JOptionPane.showInputDialog("Qual a data da matrícula?");
//        String serie = JOptionPane.showInputDialog("Qual a serie?");
//        String escola = JOptionPane.showInputDialog("Qual a escola?");
//
        aluno.setNome(nome);
//        aluno.setIdade(Integer.parseInt(idade));
//        aluno.setDataNascimento(dataNascimento);
//        aluno.setRegistroGeral(rg);
//        aluno.setNumeroCpf(cpf);
//        aluno.setNomeMae(nomeMae);
//        aluno.setNomeMae(nomePai);
//        aluno.setDataMatricula(dataMatricula);
//        aluno.setSerieMatriculado(serie);
//        aluno.setNomeEscola(escola);

            for (int i = 0; i < 4; i++) {
                String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina?");
                String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina?");
                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina(nomeDisciplina);
                disciplina.setNota(Double.parseDouble(notaDisciplina));
                aluno.getDisciplinas().add(disciplina);
            }

            int escolha = JOptionPane.showConfirmDialog(null, "deseja remover uma disciplina?");
            if (escolha == 0) {

                int continuarRemover = 0;

                while (continuarRemover == 0) {
                    String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? \n" + getMessage(aluno));
                    aluno.getDisciplinas().remove(Integer.parseInt(disciplinaRemover) - 1);

                    continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
                }
            }

            alunos.add(aluno);

        }

        for (int i = 0; i < alunos.size(); i++) {

            Aluno aluno = alunos.get(i);

            if (aluno.getNome().equalsIgnoreCase("alex")) {
                Aluno novo = new Aluno();
                novo.setNome("Novo aluno");
                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina("Matemática");
                disciplina.setNota(96);
                novo.getDisciplinas().add(disciplina);

                alunos.set(i, novo);

                aluno = alunos.get(i);
            }

            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Média: " + aluno.getMediaNota());
            System.out.println("Resultado: " + aluno.getAlunoAprovado());
            System.out.println();
            for (Disciplina disciplina : aluno.getDisciplinas()) {
                System.out.println("Materia: " + disciplina.getDisciplina() + " - Nota: " + disciplina.getNota());
            }
            System.out.println("-----------------------------------------");

        }
    }
    private static StringBuilder getMessage(Aluno aluno) {
        StringBuilder message = new StringBuilder();
        for (Disciplina disciplina : aluno.getDisciplinas()) {
            message.append(disciplina.getDisciplina()).append("\n");
        }
        return message;
    }
}