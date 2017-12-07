package com.bala.interviews.practice.general;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ThreadTest {
    private static ThreadLocal<Connection> connectionHolder = new ThreadLocal<Connection>() {
        public Connection initialValue() {
            Connection con = null;
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/TestDB");
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return con;
        }
    };

    public static Connection getConnection() {
        return connectionHolder.get();
    }
}
