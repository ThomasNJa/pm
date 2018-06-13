package com.example.service.pm;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.pm.IRegistDao;
import com.example.dao.pm.RegistDao;
import com.example.domain.pm.Account;
import com.example.domain.pm.User;


@Transactional
public class RegistService implements IRegistService{
	@Autowired
	private IRegistDao dao;
	
	public RegistService(RegistDao dao) {
		this.dao = dao;
	}

	@Override
	public void createAccount(Account account, User user) throws SQLException {
		if (dao.getUser(user) != null) {
			dao.createUser(user);
		}
		dao.createAccount(account);
	}

	@Override
	public List getAccount(Account account) throws SQLException {
		return dao.getAccount(account);
	}
	
	@Override
	public List getUser(User user) throws SQLException {
		return dao.getUser(user);
	}
}
