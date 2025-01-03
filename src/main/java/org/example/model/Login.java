package org.example.model;

import java.io.Serializable;

public class Login implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private String email;
    private String login;
    private String senha;

    public Login() {}

    public Login(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Login(String nome, String email, String login, String senha) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }
    public String getSenha() {
        return senha;
    }
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public void setLogin(String login) {this.login = login;}
    public void setSenha(String senha) {this.senha = senha;}

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    public boolean isNovo() {
        return this.id == null;
    }
}
