package com.example.demo.model.persistance;
public interface AccountDao {
	public void update(Account account);
	public void save(Account account);
	public Account find(int id);
}