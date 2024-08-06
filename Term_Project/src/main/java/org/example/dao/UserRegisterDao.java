package org.example.dao;

import org.example.connect.DBConnect;
import org.example.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRegisterDao {

    public UserRegisterDao(){

    }

    public static boolean registerUser(User user) throws SQLException, ClassNotFoundException {

        boolean status = false;

        Connection connection = DBConnect.ConnectToDB();
        String query = "Insert into users (email,username,password) values (?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1,user.getEmail());
        preparedStatement.setString(2,user.getUsername());
        preparedStatement.setString(3,user.getPassword());

        preparedStatement.executeUpdate();

        status= true;

        return status;
    }
}
