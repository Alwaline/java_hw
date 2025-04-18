package ru.itis.shop.app;

import java.sql.*;
import java.util.Scanner;

public class MainWrite {
    private static final String USER = "postgres";
    private static final String PASSWORD = "qwerty007";
    private static final String URL = "jdbc:postgresql://localhost:5432/shop_db";


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Driver not found", e);
        }

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {


            String firstName = scanner.nextLine();
            String lastName = scanner.nextLine();
            String email = scanner.nextLine();
            String password = scanner.nextLine();
            int age = scanner.nextInt();

            String sql = "insert into account(first_name, last_name, email, password, age) " +
                    "values ('" + firstName + "', '" + lastName + "', '" + email + "', '" + password + "', " + age + ");";
            System.out.println(sql);

            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new IllegalStateException("Connection exception. ", e);
        }

    }
}
