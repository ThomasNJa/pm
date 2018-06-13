package com.example.dao.pm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.common.util.DBUtil;
import com.example.domain.pm.Account;

public class LoginDao implements ILoginDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public LoginDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public Account getAccount(Account account) throws SQLException {
		Connection con = jdbcTemplate.getDataSource().getConnection();
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * FROM account WHERE account = ");
		sql.append("'"+account.getAccount()+"'");
		PreparedStatement statement = con.prepareStatement(sql.toString());
		ResultSet resultSet = statement.executeQuery();
		List list = DBUtil.resultSet2List(resultSet);
		if (list.size() == 0) {
			return null;
		}
		Map map = (Map) list.get(0);
		Account resAccount = new Account((String)map.get("account"), (String)map.get("password"), (String)map.get("userId"));
		con.close();
		return resAccount;
	}

}
