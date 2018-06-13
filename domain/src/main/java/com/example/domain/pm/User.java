package com.example.domain.pm;

/*
 idcard VARCHAR(50) PRIMARY KEY,
 username VARCHAR(50),
 age NUMERIC(3,0),
 telephone VARCHAR(50),
 address VARCHAR(50),
 roleid VARCHAR(50),
 */

public class User {
	private String idCard;
	private String userName;
	private String telephone;
	private String address;
	private String roleId;
	private String email;
	
	
	public User() {
	}
	public User(String idCard, String userName, String telephone, String address, String roleId, String email) {
		this.idCard = idCard;
		this.userName = userName;
		this.telephone = telephone;
		this.address = address;
		this.roleId = roleId;
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
}
