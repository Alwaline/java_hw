package ru.itis.shop.account.repository.impl;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import ru.itis.shop.account.entity.Account;
import ru.itis.shop.account.repository.AccountRepository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountRepositoryJdbcTemplateImpl implements AccountRepository {

    private static final String SQL_SELECT_ALL_FROM_ACCOUNT = "select * from account";

    private static final String SQL_SELECT_FROM_ACCOUNT = "select * from account where id = ?";

    private final JdbcTemplate jdbcTemplate;

    public AccountRepositoryJdbcTemplateImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static final RowMapper<Account> accountRowMapper = new RowMapper<Account>() {
        @Override
        public Account mapRow(ResultSet row, int rowNum) throws SQLException {
            return new Account(row.getInt("id"),
                    row.getString("first_name"),
                    row.getString("last_name"),
                    row.getString("email"),
                    row.getString("password"),
                    row.getInt("age"));
        }
    };

    @Override
    public List<Account> findAll() {
        return jdbcTemplate.query(SQL_SELECT_ALL_FROM_ACCOUNT, accountRowMapper);
    }

    @Override
    public void save(Account account) {
        Map<String, Object> params = new HashMap<>();
        params.put("fist_name", account.getFirstName());
        params.put("last_name", account.getLastName());
        params.put("email", account.getEmail());
        params.put("password", account.getPassword());
        params.put("age", account.getAge());

        Integer id =  new SimpleJdbcInsert(jdbcTemplate)
                .withTableName("account").usingGeneratedKeyColumns("id")
                .executeAndReturnKey(params).intValue();

        account.setId(id);
    }

    @Override
    public Account findById(Integer id) {
        try {
            return jdbcTemplate.queryForObject(SQL_SELECT_FROM_ACCOUNT, accountRowMapper, id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
