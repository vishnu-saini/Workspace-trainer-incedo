package com.example.demo.model.persistance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class AccountDaoImp implements AccountDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void update(Account account) {
		
		String sql = "update account set balance = ? where id=?";
		
		jdbcTemplate.update(sql,new Object[] { account.getBalance(),account.getId() });

	}

	@Override
	public void save(Account account) {
		String sql = "INSERT INTO account (id, name, balance ) VALUES (?, ?, ?)";

		jdbcTemplate.update(
				sql,
				new Object[] { account.getId(), account.getName(),
						account.getBalance() });
	}

	@Override
	public Account find(int id) {
		String sql = "SELECT * FROM account WHERE id = ?";
		Account account =  jdbcTemplate.queryForObject(sql,new AccountRowMapper(), id);
		return account;
	}

}
