package com.it.bean;

/*
 auth_id			int(11) NOT NULL权限id
 auth_name		varchar(20) NULL权限名
 auth_description varchar(200) NULL权限描述
 delete_flag		bigint(1) NULL用户状态，0可用，1不可用，可由管理员进行修改
 */
public class Auth_info {

	private int auth_id;
	private String auth_name;
	private String auth_description;
	private int delete_flag;
	public int getAuth_id() {
		return auth_id;
	}
	public void setAuth_id(int auth_id) {
		this.auth_id = auth_id;
	}
	public String getAuth_name() {
		return auth_name;
	}
	public void setAuth_name(String auth_name) {
		this.auth_name = auth_name;
	}
	public String getAuth_description() {
		return auth_description;
	}
	public void setAuth_description(String auth_description) {
		this.auth_description = auth_description;
	}
	public int getDelete_flag() {
		return delete_flag;
	}
	public void setDelete_flag(int delete_flag) {
		this.delete_flag = delete_flag;
	}
	public Auth_info() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Auth_info(int auth_id, String auth_name, String auth_description,
			int delete_flag) {
		super();
		this.auth_id = auth_id;
		this.auth_name = auth_name;
		this.auth_description = auth_description;
		this.delete_flag = delete_flag;
	}
	
	
}
