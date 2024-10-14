package org.example.model;

import java.io.Serializable;

public class Login implements Serializable {
    private static final long serialVersionUID = 1L;

    private String login;
    private String senha;

    public Login(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
}
