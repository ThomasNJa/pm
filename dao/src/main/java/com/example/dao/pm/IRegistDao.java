package com.example.dao.pm;

import java.sql.SQLException;
import java.util.List;

import com.example.domain.pm.Account;
import com.example.domain.pm.User;


public interface IRegistDao {

	public void createAccount(Account account) throws SQLException;

	public void createUser(User user) throws SQLException;

	public List getAccount(Account account) throws SQLException;

	public List getUser(User user) throws SQLException;

}
