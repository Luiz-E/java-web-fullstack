package org.example.dao;

import org.example.connection.SingleConnection;
import org.example.model.Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOUsuarioRepository {

    private Connection conn;

    public DAOUsuarioRepository() {
        conn = SingleConnection.getConn();
    }

    public Login gravarUsuario(Login modelLogin) throws SQLException {
        String sql = "INSERT INTO model_login (nome, email, login, senha) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, modelLogin.getNome());
        preparedStatement.setString(2, modelLogin.getEmail());
        preparedStatement.setString(3, modelLogin.getLogin());
        preparedStatement.setString(4, modelLogin.getSenha());
        preparedStatement.execute();
        conn.commit();

        return this.consultaUsuario(modelLogin.getLogin());
    }

    public Login consultaUsuario(String login) throws SQLException {
        Login modelLogin = new Login();
        String sql = "SELECT * FROM model_login WHERE upper(login) = upper('"+login+"')";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        ResultSet result = preparedStatement.executeQuery();
        if (result.next()) {
            modelLogin.setId(result.getLong("id"));
            modelLogin.setEmail(result.getString("email"));
            modelLogin.setNome(result.getString("nome"));
            modelLogin.setLogin(result.getString("login"));
            modelLogin.setSenha(result.getString("senha"));
        }
        return modelLogin;
    }

    public boolean validarLogin(String login) throws SQLException {
        String sql = "select count(1) > 0 as existe from model_login where upper(login) = upper('"+login+"')";
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet result = statement.executeQuery();
        if (result.next()) {
            return result.getBoolean("existe");
        }
        return false;
    }
}
