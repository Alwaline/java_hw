package ru.itis.shop.utils;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbUtil {

    public Connection getConnection() {


        Properties properties = new Properties();

        try {
            properties.load(new FileReader("resources\\db.properties"));

            Class.forName(properties.getProperty("db.jdbc.driver-class-name"));

            return DriverManager.getConnection(properties.getProperty("db.jdbc.url"),
                    properties.getProperty("db.jdbc.username"),
                    properties.getProperty("db.jdbc.password"));
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
