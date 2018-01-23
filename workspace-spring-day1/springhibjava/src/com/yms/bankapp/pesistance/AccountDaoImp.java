package com.yms.bankapp.pesistance;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImp implements AccountDao {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void update(Account account) {
		getSession().update(account);
	}

	@Override
	public Account find(int id) {
		return (Account) getSession().get(Account.class, id);
	}

}
