package com.it.bean;

/*
 * 
 role_id		int(11) NOT NULL主键ID
 role_name	varchar(255) NOT NULL角色名
 auth_ids	varchar(255) NOT NULL权限
 */
public class Role_info {

	private int role_id;
	private String role_name;
	private String auth_ids;
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getAuth_ids() {
		return auth_ids;
	}
	public void setAuth_ids(String auth_ids) {
		this.auth_ids = auth_ids;
	}
	public Role_info() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role_info(int role_id, String role_name, String auth_ids) {
		super();
		this.role_id = role_id;
		this.role_name = role_name;
		this.auth_ids = auth_ids;
	}
	@Override
	public String toString() {
		return "Role_info [role_id=" + role_id + ", role_name=" + role_name
				+ ", auth_ids=" + auth_ids + "]";
	}
	
	
}
