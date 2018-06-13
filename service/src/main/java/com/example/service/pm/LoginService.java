package com.example.service.pm;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.pm.ILoginDao;
import com.example.dao.pm.LoginDao;
import com.example.domain.pm.Account;


@Transactional
public class LoginService implements ILoginService{
	
	@Autowired
	private ILoginDao dao;

	public LoginService(LoginDao dao) {
		this.dao = dao;
	}

	@Override
	public Account getAccount(Account account) throws SQLException {
		return dao.getAccount(account);
	}

}
