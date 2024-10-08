package org.example.dao;

import org.example.conexaojdbc.SingleConnection;
import org.example.model.UserposJava;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserPosDAO {

    private Connection conn;

    public UserPosDAO() {
        conn = SingleConnection.getConn();
    }

    public void salvar(UserposJava user) {
        try {
            String sql = "insert into userposjava (id, nome, email) values (?, ?, ?)";
            PreparedStatement insertStatement = conn.prepareStatement(sql);
            insertStatement.setLong(1, user.getId());
            insertStatement.setString(2, user.getNome());
            insertStatement.setString(3, user.getEmail());
            insertStatement.execute();
            conn.commit();
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
    }
}
