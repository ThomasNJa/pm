package com.example.domain.pm;

/*
 account VARCHAR(50) PRIMARY KEY,
 PASSWORD VARCHAR(50),
 userId VARCHAR(50),
 */
public class Account {
	private String account;
	private String password;
	private String userId;
	public Account() {
	}
	public Account(String account, String password, String userId) {
		this.account = account;
		this.password = password;
		this.userId = userId;
	}
	public Account(String account, String password) {
		this.account = account;
		this.password = password;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
