package org.example.dao;

import org.example.connection.SingleConnection;
import org.example.model.Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOLoginRepository {

    private Connection conn;

    public DAOLoginRepository() {
        this.conn = SingleConnection.getConn();
    }

    public boolean validarAutenticacao(Login login) throws Exception {
        String sql = "select * from model_login where upper(login) = upper(?) and upper(senha) = upper(?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, login.getLogin());
        statement.setString(2, login.getSenha());

        ResultSet result = statement.executeQuery();
        return result.next();
    }
}
