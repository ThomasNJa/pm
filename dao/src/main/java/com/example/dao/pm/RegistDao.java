package com.example.dao.pm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.common.util.DBUtil;
import com.example.domain.pm.Account;
import com.example.domain.pm.User;

public class RegistDao implements IRegistDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public RegistDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void createAccount(Account account) throws SQLException {
		Connection con = jdbcTemplate.getDataSource().getConnection();
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO account VALUES(");
		sql.append("'"+account.getAccount()+"',");
		sql.append("'"+account.getPassword()+"',");
		sql.append("'"+account.getUserId()+"')");
		PreparedStatement statement = con.prepareStatement(sql.toString());
		statement.execute();
		con.close();
	}

	@Override
	public void createUser(User user) throws SQLException {
		Connection con = jdbcTemplate.getDataSource().getConnection();
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO user VALUES(");
		sql.append("'"+user.getIdCard()+"',");
		sql.append("'"+user.getUserName()+"',");
		sql.append("'"+user.getTelephone()+"',");
		sql.append("'"+user.getAddress()+"',");
		sql.append("'"+user.getRoleId()+"',");
		sql.append("'"+user.getEmail()+"')");
		PreparedStatement statement = con.prepareStatement(sql.toString());
		statement.execute();
		con.close();
	}
	
	@Override
	public List getAccount(Account account) throws SQLException {
		Connection con = jdbcTemplate.getDataSource().getConnection();
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * FROM account ");
		sql.append("WHERE account = ");
		sql.append("'"+account.getAccount()+"'");
		PreparedStatement statement = con.prepareStatement(sql.toString());
		ResultSet resultSet = statement.executeQuery();
		con.close();
		return DBUtil.resultSet2List(resultSet);
	}
	
	@Override
	public List getUser(User user) throws SQLException {
		Connection con = jdbcTemplate.getDataSource().getConnection();
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * FROM user ");
		sql.append("WHERE idcard = ");
		sql.append("'"+user.getIdCard()+"'");
		PreparedStatement statement = con.prepareStatement(sql.toString());
		ResultSet resultSet = statement.executeQuery();
		con.close();
		return DBUtil.resultSet2List(resultSet);
	}
}
