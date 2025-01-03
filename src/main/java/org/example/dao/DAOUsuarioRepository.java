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
        if (modelLogin.isNovo()) {
            String sql = "INSERT INTO model_login (nome, email, login, senha) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, modelLogin.getNome());
            statement.setString(2, modelLogin.getEmail());
            statement.setString(3, modelLogin.getLogin());
            statement.setString(4, modelLogin.getSenha());
            statement.execute();
            conn.commit();
        } else {
            String sql = "UPDATE model_login SET nome=?, senha=?, login=?, email=? WHERE id = " +modelLogin.getId();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, modelLogin.getNome());
            statement.setString(2, modelLogin.getSenha());
            statement.setString(3, modelLogin.getLogin());
            statement.setString(4, modelLogin.getEmail());
            statement.executeUpdate();
            conn.commit();
        }
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
