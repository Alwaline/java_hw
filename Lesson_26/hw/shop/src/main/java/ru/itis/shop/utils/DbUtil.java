package ru.itis.shop.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbUtil {
    public Connection getConnection() {

        Properties properties = new Properties();

        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("db.properties"));
            
            return DriverManager.getConnection(properties.getProperty("db.jdbc.url"), 
                    properties.getProperty("db.jdbc.username"),
                    properties.getProperty("db.jdbc.password"));

        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
