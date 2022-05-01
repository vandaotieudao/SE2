package com.example.tut2.dbconnect;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    private static final String DB_URL ="jdbc:mysql://localhost:3306/studentdb";
    private static final String DB_USERNAME = "root";
    private static final  String DB_PASSWORD ="root";

    public static Connection getConnection() {
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return connection;
    }
}
