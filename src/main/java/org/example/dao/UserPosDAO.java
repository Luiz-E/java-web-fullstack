package org.example.dao;

import org.example.conexaojdbc.SingleConnection;
import org.example.model.BeanUserFone;
import org.example.model.Telefone;
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
            String sql = "insert into userposjava (nome, email) values (?, ?)";
            PreparedStatement insertStatement = conn.prepareStatement(sql);
            insertStatement.setString(1, user.getNome());
            insertStatement.setString(2, user.getEmail());
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

    public void salvarTelefone(Telefone telefone) {
        String sql = "insert into telefoneuser (numero, tipo, usuariopessoa) values (?, ?, ?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, telefone.getNumero());
            statement.setString(2, telefone.getTipo());
            statement.setLong(3, telefone.getUsuario());
            statement.execute();
            conn.commit();
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
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

    public void update(UserposJava userUpdate) {
        String sql = "update userposjava set nome = ? where id = " + userUpdate.getId();
        try {
            PreparedStatement updateStatement = conn.prepareStatement(sql);
            updateStatement.setString(1, userUpdate.getNome());
            updateStatement.execute();
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(Long id) {
        String sql = "delete from userposjava where id = ?";
        try {
            PreparedStatement deleteStatement = conn.prepareStatement(sql);
            deleteStatement.setLong(1, id);
            deleteStatement.execute();
            conn.commit();
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }

    public List<BeanUserFone> listaUserFone(Long id) {
        List<BeanUserFone> beanUserFones = new ArrayList<>();
        String sql = "select nome, numero, email from telefoneuser as fone inner join userposjava as userp on userp.id = fone.usuariopessoa where userp.id = " + id;
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
             while (resultSet.next()) {
                 BeanUserFone userFone = new BeanUserFone();
                 userFone.setEmail(resultSet.getString("email"));
                 userFone.setNome(resultSet.getString("nome"));
                 userFone.setNumero(resultSet.getString("numero"));
                 beanUserFones.add(userFone);
             }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return beanUserFones;
    }

}
