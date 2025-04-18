package ru.itis.shop.account.repository.impl;

import ru.itis.shop.account.entity.Account;
import ru.itis.shop.account.repository.AccountRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountRepositoryJdbcImpl implements AccountRepository {

    private static final String SQL_SELECT_ALL_FROM_ACCOUNT = "select * from account";

    private static final String SQL_INSERT_INTO_ACCOUNT = "insert into " +
            "account(first_name, last_name, email, password, age) values(?,?,?,?,?)";

    private final Connection connection;

    public AccountRepositoryJdbcImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Account> findAll() {
        List<Account> accounts = new ArrayList<>();

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SQL_SELECT_ALL_FROM_ACCOUNT)) {

            while (resultSet.next()) {
                Account account = new Account(resultSet.getInt("id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("email"),
                        resultSet.getString("password"),
                        resultSet.getInt("age"));

                accounts.add(account);
            }

        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }

        return accounts;
    }

    @Override
    public void save(Account account) {
        try (PreparedStatement statement = connection.prepareStatement(SQL_INSERT_INTO_ACCOUNT)) {

            statement.setString(1, account.getFirstName());
            statement.setString(2, account.getLastName());
            statement.setString(3, account.getEmail());
            statement.setString(4, account.getPassword());
            statement.setInt(5, account.getAge());

            int affectedRows = statement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Failed to insert row into account");
            }

        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
