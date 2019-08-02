package com.it.bean;

import java.time.LocalDateTime;

/*
 * user_id		int(11) NOT NULL主键用户id
 user_name		varchar(255) NULL用户姓名，不是账号！
 user_password	varchar(1024) NOT NULL用户密码
 mobile_phone	bigint(11) NOT NULL用户电话号码，登录账号
 qq				bigint(10) NULL用户QQ
 sex				varchar(8) NULL用户性别
 address			varchar(255) NULL用户地址
 email			varchar(255) NULL邮箱
 role_id			int(1) NOT NULL用户权限，1管理员，（2超级管理员 待定）
 salt			varchar(255) NULL盐
 add_time		datetime NOT NULL注册时间
 delete_flag		bigint(1) NOT NULL用户状态，0可用，1不可用，可由管理员进行修改
 */
public class User_info {

	private int user_id;
	private String user_name;
	private String user_password;
	private int mobile_phone;
	private int qq;
	private String sex;
	private String address;
	private String email;
	private int role_id;
	private String salt;
	private LocalDateTime add_time;
	private int delete_flag;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public int getMobile_phone() {
		return mobile_phone;
	}

	public void setMobile_phone(int mobile_phone) {
		this.mobile_phone = mobile_phone;
	}

	public int getQq() {
		return qq;
	}

	public void setQq(int qq) {
		this.qq = qq;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public LocalDateTime getAdd_time() {
		return add_time;
	}

	public void setAdd_time(LocalDateTime add_time) {
		this.add_time = add_time;
	}

	public int getDelete_flag() {
		return delete_flag;
	}

	public void setDelete_flag(int delete_flag) {
		this.delete_flag = delete_flag;
	}

	public User_info() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User_info(int user_id, String user_name, String user_password,
			int mobile_phone, int qq, String sex, String address, String email,
			int role_id, String salt, LocalDateTime add_time, int delete_flag) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_password = user_password;
		this.mobile_phone = mobile_phone;
		this.qq = qq;
		this.sex = sex;
		this.address = address;
		this.email = email;
		this.role_id = role_id;
		this.salt = salt;
		this.add_time = add_time;
		this.delete_flag = delete_flag;
	}

	@Override
	public String toString() {
		return "User_info [user_id=" + user_id + ", user_name=" + user_name
				+ ", user_password=" + user_password + ", mobile_phone="
				+ mobile_phone + ", qq=" + qq + ", sex=" + sex + ", address="
				+ address + ", email=" + email + ", role_id=" + role_id
				+ ", salt=" + salt + ", add_time=" + add_time
				+ ", delete_flag=" + delete_flag + "]";
	}

}
