package ru.itis.shop.homework;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class MainWriteHw {
    
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";
    private static final String URL = "jdbc:postgresql://localhost:5432/shop_db";


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement()) {
                
                String firstName = scanner.nextLine();
                String lastName = scanner.nextLine();
                String email = scanner.nextLine();
                String password = scanner.nextLine();
                int age = scanner.nextInt();
                scanner.nextLine();

                String sql = "insert into account(first_name, last_name, email, password, age)" +
                "values ('" + firstName + "', '"  
                + lastName + "', '"
                + email + "', '"
                + password + "', '"
                + age + "'"
                + ")";

                System.out.println(sql);

                statement.executeUpdate(sql);

        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

}
