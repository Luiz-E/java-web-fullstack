package org.example.executavel;

import org.example.classes.Aluno;
import org.example.classes.Disciplina;
import org.example.constantes.StatusAluno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();

        HashMap<String, List<Aluno>> maps = new HashMap<>();

        for (int numeroAlunos = 0; numeroAlunos < 5; numeroAlunos++) {

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

            for (int i = 0; i < 1; i++) {
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

        maps.put(StatusAluno.APROVADO, new ArrayList<>());
        maps.put(StatusAluno.RECUPERACAO, new ArrayList<>());
        maps.put(StatusAluno.REPROVADO, new ArrayList<>());

        for (Aluno aluno : alunos) {
            if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
                maps.get(StatusAluno.APROVADO).add(aluno);
            } else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                maps.get(StatusAluno.RECUPERACAO).add(aluno);
            } else {
                maps.get(StatusAluno.REPROVADO).add(aluno);
            }
        }

        System.out.println("Alunos Aprovados:");
        for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
            System.out.println(aluno.getNome());
        }
        System.out.println("Alunos em Recuperação:");
        for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
            System.out.println(aluno.getNome());
        }
        System.out.println("Alunos Reprovados:");
        for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
            System.out.println(aluno.getNome());
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