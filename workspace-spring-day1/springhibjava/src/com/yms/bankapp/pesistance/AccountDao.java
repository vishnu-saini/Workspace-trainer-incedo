package com.yms.bankapp.pesistance;
public interface AccountDao {
	public void update(Account account);
	public Account find(int id);
	//
}
