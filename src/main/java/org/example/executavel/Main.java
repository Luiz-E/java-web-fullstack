package org.example.executavel;

import org.example.classes.*;
import org.example.classesauxiliares.FuncaoAutenticacao;
import org.example.constantes.StatusAluno;
import org.example.interfaces.PermitirAcesso;

import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {

            new File("arquivo.txt");

            String login = JOptionPane.showInputDialog("Informe o login");
            String senha = JOptionPane.showInputDialog("Informe o login");

//        FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();
            PermitirAcesso permitirAcesso = new Secretario(login, senha);

            if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {
                List<Aluno> alunos = new ArrayList<>();

                HashMap<String, List<Aluno>> maps = new HashMap<>();

                for (int numeroAlunos = 0; numeroAlunos < 2; numeroAlunos++) {

                    Aluno aluno = new Aluno();
                    String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
                    String idade = JOptionPane.showInputDialog("Qual a idade? ");
                    aluno.setNome(nome);
                    aluno.setIdade(Integer.parseInt(idade));

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
                    System.out.println("Aqui o erro");
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
            } else {
                JOptionPane.showMessageDialog(null, "Acesso não permitido");
            }
        } catch (NumberFormatException e) {

            StringBuilder saida = new StringBuilder();

            e.printStackTrace();

            System.out.println("Mesagem: " + e.getMessage());
            for( StackTraceElement el : e.getStackTrace()) {
                System.out.println(el);
                saida.append("\nClasse de erro: ").append(el.getClassName());
                saida.append("\nMétodo de erro: ").append(el.getMethodName());
                saida.append("\nLinha de erro: ").append(el.getLineNumber());
                saida.append("\nClass: ").append(e.getClass().getName());
            }

            JOptionPane.showMessageDialog(null, "Erro de conversão de número" + saida);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Opa um null pointer exception" + e.getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static StringBuilder getMessage(Aluno aluno) {
        StringBuilder message = new StringBuilder();
        for (Disciplina disciplina : aluno.getDisciplinas()) {
            message.append(disciplina.getDisciplina()).append("\n");
        }
        return message;
    }

    public static void teste(Pessoa pessoa) {
        System.out.println("Essa pessoa é demais = " + pessoa.getNome() + " e o salário é de " + pessoa.salario());
    }
}