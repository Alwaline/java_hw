package ru.itis.shop.app;

import java.sql.*;
import java.util.Scanner;

public class MainRead {

    private static final String USER = "postgres";
    private static final String PASSWORD = "qwerty007";
    private static final String URL = "jdbc:postgresql://localhost:5432/shop_db";

    //language=SQL
    private static final String SQL_SELECT_ALL_FROM_ACCOUNT = "SELECT * FROM account";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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

                System.out.println(id + " " + firstName + " " + lastName + " " + email + " " + password + " " + age);

                firstName = scanner.nextLine();
                lastName = scanner.nextLine();
                email = scanner.nextLine();
                password = scanner.nextLine();
                age = scanner.nextInt();

                String sql = "insert into account(first_name, last_name, email, password, age) " +
                        "values ('" + firstName + "', '" + lastName + "', '" + email + "', '" + password + "', " + age + ");";
                System.out.println(sql);
            }

        } catch (SQLException e) {
            throw new IllegalStateException("Connection exception. ", e);
        }

    }
}
