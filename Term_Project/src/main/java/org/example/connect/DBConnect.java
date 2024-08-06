package org.example.connect;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    static Connection connection;

    public static Connection ConnectToDB() throws ClassNotFoundException, SQLException {


        // Load the JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/event_management";
        String username ="root";
        String password = "root";

        // Establish connection to database.
        connection =DriverManager.getConnection(url,username,password);


       return connection;
    }


}
