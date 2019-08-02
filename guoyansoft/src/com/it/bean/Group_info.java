package com.it.bean;

import java.time.LocalDateTime;

/*
 * group_id		int(11) NOT NULL主键ID
 group_name		varchar(255) NOT NULL组名
 remake			varchar(255) NOT NULL备注
 add_time		datetime NOT NULL添加时间
 add_user		varchar(255) NOT NULL添加人
 add_user_id		int(11) NOT NULL用户主键
 delete_flag		varchar(255) NOT NULL删除，0 否，1是
 */
public class Group_info {

	private int group_id;
	private String group_name;
	private String remake;
	private LocalDateTime add_time;
	private String add_user;
	private int add_user_id;
	private String delete_flag;
	public int getGroup_id() {
		return group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	public String getRemake() {
		return remake;
	}
	public void setRemake(String remake) {
		this.remake = remake;
	}
	public LocalDateTime getAdd_time() {
		return add_time;
	}
	public void setAdd_time(LocalDateTime add_time) {
		this.add_time = add_time;
	}
	public String getAdd_user() {
		return add_user;
	}
	public void setAdd_user(String add_user) {
		this.add_user = add_user;
	}
	public int getAdd_user_id() {
		return add_user_id;
	}
	public void setAdd_user_id(int add_user_id) {
		this.add_user_id = add_user_id;
	}
	public String getDelete_flag() {
		return delete_flag;
	}
	public void setDelete_flag(String delete_flag) {
		this.delete_flag = delete_flag;
	}
	public Group_info() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Group_info(int group_id, String group_name, String remake,
			LocalDateTime add_time, String add_user, int add_user_id,
			String delete_flag) {
		super();
		this.group_id = group_id;
		this.group_name = group_name;
		this.remake = remake;
		this.add_time = add_time;
		this.add_user = add_user;
		this.add_user_id = add_user_id;
		this.delete_flag = delete_flag;
	}
	@Override
	public String toString() {
		return "Group_info [group_id=" + group_id + ", group_name="
				+ group_name + ", remake=" + remake + ", add_time=" + add_time
				+ ", add_user=" + add_user + ", add_user_id=" + add_user_id
				+ ", delete_flag=" + delete_flag + "]";
	}
	
	
}
