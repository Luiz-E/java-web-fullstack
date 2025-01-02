package org.example.dao;

import org.example.connection.SingleConnection;
import org.example.model.Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOUsuarioRepository {

    private Connection conn;

    public DAOUsuarioRepository() {
        conn = SingleConnection.getConn();
    }

    public void gravarUsuario(Login modelLogin) throws SQLException {
        String sql = "INSERT INTO model_login (nome, email, login, senha) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, modelLogin.getNome());
        preparedStatement.setString(2, modelLogin.getEmail());
        preparedStatement.setString(3, modelLogin.getLogin());
        preparedStatement.setString(4, modelLogin.getSenha());
        preparedStatement.execute();
        conn.commit();
    }
}
