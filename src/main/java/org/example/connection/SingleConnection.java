package org.example.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {
    private static String url = "jdbc:postgresql://localhost:5432/curso-jsp?autoReconnect=true";
    private static String user = "postgres";
    private static String password = "12345";
    private static Connection conn = null;

    static {
        conectar();
    }

    public SingleConnection() {
        conectar();
    }

    public static Connection getConn() {
        return conn;
    }

    private static void conectar() {
        try {

            if (conn == null) {
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection(url, user, password);
                conn.setAutoCommit(false);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
