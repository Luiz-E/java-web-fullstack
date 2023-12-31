package org.example.classes;

import org.example.interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {

    private String registroEducacao;
    private int tempoDirecao;
    private String titulacao;
    String login;
    String senha;

    public Diretor(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Diretor(){};

    @Override
    public boolean autenticar(String login, String senha) {
        this.login = login;
        this.senha = senha;
        return login.equals("adm") && senha.equals("adm");
    }

    @Override
    public boolean autenticar() {
        return login.equals("adm") && senha.equals("adm");
    }



    @Override
    public double salario() {
        return 3900.78;
    }

    public String getRegistroEducacao() {
        return registroEducacao;
    }

    public void setRegistroEducacao(String registroEducacao) {
        this.registroEducacao = registroEducacao;
    }

    public int getTempoDirecao() {
        return tempoDirecao;
    }

    public void setTempoDirecao(int tempoDirecao) {
        this.tempoDirecao = tempoDirecao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "registroEducacao='" + registroEducacao + '\'' +
                ", tempoDirecao=" + tempoDirecao +
                ", titulacao='" + titulacao + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                '}';
    }
}
