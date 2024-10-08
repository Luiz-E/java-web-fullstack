package org.example.dao;

import org.example.conexaojdbc.SingleConnection;

import java.sql.Connection;

public class UserPosDAO {

    private Connection conn;

    public UserPosDAO() {
        conn = SingleConnection.getConn();
    }

}
