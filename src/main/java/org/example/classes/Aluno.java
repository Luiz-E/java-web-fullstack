package org.example.classes;

public class Aluno {
    public String nome;
    int idade;
    private String dataNascimento;
    String registroGeral;
    String numeroCpf;
    String nomeMae;
    String nomePai;
    String dataMatricula;
    String nomeEscola;
    String serieMatriculado;

    public Aluno() {}
    public Aluno(String nomePadrao) {
        this.nome = nomePadrao;
    }

    public Aluno (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

}
