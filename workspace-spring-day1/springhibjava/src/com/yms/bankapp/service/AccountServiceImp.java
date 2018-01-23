package com.yms.bankapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.yms.bankapp.pesistance.Account;
import com.yms.bankapp.pesistance.AccountDao;

@Service(value="accountService")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class AccountServiceImp implements AccountService {
	
		@Autowired
		private AccountDao accountDao;
		
		public void setAccountDao(AccountDao accountDao) {
			this.accountDao = accountDao;
		}
	
		@Transactional( isolation=Isolation.REPEATABLE_READ,
				propagation=Propagation.REQUIRED, readOnly=false)
		@Override
		public void transfer(int from, int to, int amout) {
			Account fromAccount=accountDao.find(from);
			Account toAccount=accountDao.find(to);
			
			fromAccount.setBalance(fromAccount.getBalance()-amout);
			toAccount.setBalance(toAccount.getBalance()+amout);
			
			accountDao.update(fromAccount);
			accountDao.update(toAccount);
			System.out.println("------------");
		}
	
		@Override
		public void deposit(int id, double amount) {
			Account account=accountDao.find(id);
			account.setBalance(account.getBalance()+amount);
			accountDao.update(account);
		}
	
		@Override
		public Account getAccount(int id) {
			// TODO Auto-generated method stub
			return accountDao.find(id);
		}
	
	}

