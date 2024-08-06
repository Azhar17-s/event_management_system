package org.example.dao;

import org.example.connect.DBConnect;
import org.example.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserLoginDao {

    public UserLoginDao(){

    }

    public static boolean LoginUser(User user) throws SQLException, ClassNotFoundException {

        boolean status = false;

        Connection connection = DBConnect.ConnectToDB();

        String selectQuery = "SELECT * FROM users WHERE email = ? AND password = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);

        preparedStatement.setString(1, user.getEmail());
        preparedStatement.setString(2,user.getPassword());

        preparedStatement.executeUpdate();

        status = true;

        return status;

    }

}
