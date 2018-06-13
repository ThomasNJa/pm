package com.example.domain.pm;

/*
 roleid VARCHAR(50) PRIMARY KEY,
 rolename VARCHAR(50)
 */
public class Role {
	private String roleId;
	private String roleName;
	
	
	public Role() {
	}
	public Role(String roleId, String roleName) {
		this.roleId = roleId;
		this.roleName = roleName;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
