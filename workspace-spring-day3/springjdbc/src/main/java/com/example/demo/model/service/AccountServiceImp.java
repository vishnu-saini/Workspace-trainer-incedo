package com.example.demo.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.persistance.Account;
import com.example.demo.model.persistance.AccountDao;

@Service
@Transactional(readOnly=true,propagation=Propagation.SUPPORTS)
public class AccountServiceImp implements AccountService{

	@Autowired
	private AccountDao dao;
	@Override
	public void transfer(int from, int to, double amount) {
		Account fromAccount=dao.find(from);
		Account toAccount=dao.find(to);
		fromAccount.setBalance(fromAccount.getBalance()-amount);
		toAccount.setBalance(toAccount.getBalance()+amount);
		dao.update(fromAccount);
		dao.update(toAccount);
	}

}
