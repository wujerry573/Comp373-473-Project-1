package com.facility.dal;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {

    public static Connection getConnection() {
        System.out.println("Connecting to PostgreSQL database...");

        try {
            Class.forName("org.postgresql.Driver")
;        } catch (ClassNotFoundException e){
            System.out.println("DBHelper: Check where your PostgreSQL JDBC Driver exists and " + "Include in your library path!");
            e.printStackTrace();
            return null;
        }
        System.out.println("PostgreSQL JDBC Driver Registered!");

        Connection connection = null;
        try {
            //need to update url, user, and password to correct values once database is implemented
            connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/Facility", "", "");
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT VERSION()");

            if (rs.next()) {
                System.out.println("Database version is: " + rs.getString(1));
            }

        } catch (SQLException e) {

            System.out.println("Connection failed, check console output.");
            e.printStackTrace();
            return null;

        }

        if (connection != null) {
            System.out.println("Connected!");
        } else {
            System.out.println("Connection failed!");
        }

        return connection;
    }
}
