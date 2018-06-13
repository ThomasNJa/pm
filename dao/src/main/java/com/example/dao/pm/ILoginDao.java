package com.example.dao.pm;

import java.sql.SQLException;

import com.example.domain.pm.Account;


public interface ILoginDao {
	public Account getAccount(Account account) throws SQLException;
}
