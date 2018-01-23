package com.example.demo.model.persistance;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AccountRowMapper implements RowMapper<Account> {

	@Override
	public Account mapRow(ResultSet rs, int arg1) throws SQLException {
		//used to map tuple to oo
		Account account=new Account();
		account.setId(rs.getInt("id"));
		account.setName(rs.getString("name"));
		account.setBalance(rs.getDouble("balance"));
		return account;
	}

}