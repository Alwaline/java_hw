package ru.itis.shop.homework;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainReadHw {
    
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";
    private static final String URL = "jdbc:postgresql://localhost:5432/shop_db";

    //language=SQL
    private static final String SQL_SELECT_ALL_FROM_ACCOUNT = "SELECT * FROM account";

    public static void main(String[] args) {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Driver not found", e);
        }

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL_FROM_ACCOUNT)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                int age = resultSet.getInt("age");

                System.out.println(id + " " 
                                + firstName + " "
                                + lastName + " "
                                + email + " "
                                + password + " "
                                + age);
    
            }

        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

}
