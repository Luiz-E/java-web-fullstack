package org.example.conexaojdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {

    private static String url = "jdbc:postgresql://localhost:5432/posjava";
    private static String password = "12345";
    private static String user = "postgres";
    private static Connection conn = null;

    static {
        conectar();
    }

    public SingleConnection() {
        conectar();
    }

    private static void conectar() {
        try {
            if (conn == null) {
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection(url, user, password);
                conn.setAutoCommit(false);
                System.out.println("Conectado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConn() {
        return conn;
    }

}