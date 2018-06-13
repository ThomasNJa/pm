package com.example.service.pm;

import java.sql.SQLException;

import com.example.domain.pm.Account;


public interface ILoginService {
	public Account getAccount(Account account) throws SQLException;
}
