package org.example.dao;

import org.example.conexaojdbc.SingleConnection;
import org.example.model.UserposJava;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public List<UserposJava> listar() {
        List<UserposJava> list = new ArrayList<>();
        String sql = "select * from userposjava";
        try {
            PreparedStatement selectStatement = conn.prepareStatement(sql);
            ResultSet result = selectStatement.executeQuery();
            while (result.next()) {
                UserposJava user = new UserposJava();
                user.setId(result.getLong("id"));
                user.setNome(result.getString("nome"));
                user.setEmail(result.getString("email"));

                list.add(user);
            }
        } catch (Exception e) {

        }
        return list;
    }

    public UserposJava buscar(Long id) {
        UserposJava user = new UserposJava();
        String sql = "select * from userposjava where id = " + id;
        try {
            PreparedStatement selectStatement = conn.prepareStatement(sql);
            ResultSet result = selectStatement.executeQuery();
            if (result.next()) {
                user.setId(result.getLong("id"));
                user.setNome(result.getString("nome"));
                user.setEmail(result.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
