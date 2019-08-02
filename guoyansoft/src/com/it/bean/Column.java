package com.it.bean;

import java.time.LocalDateTime;

/*
 * 
FieldTypeComment
column_id int(11) NOT NULL栏目主键ID
column_name varchar(255) NOT NULL栏目名称
column_group int(1) NOT NULL栏目分组1 not ,2 nav,3 not + nav
add_time datetime NOT NULL添加时间
add_user varchar(255) NOT NULL添加人
add_user_id int(11) NOT NULL添加人 ID
delete_flag bigint(1) NOT NULL删除？0 否 1是
row_id int(255) NOT NULL行ID
column_index varchar(255) NOT NULL栏目索引
 */
public class Column {
	
	private int column_id;
	private String column_name;
	private int column_group;
	private LocalDateTime add_time;
	private String add_user;
	private int add_user_id;
	private int delete_flag;
	private int row_id;
	private String column_index;
	public int getColumn_id() {
		return column_id;
	}
	public void setColumn_id(int column_id) {
		this.column_id = column_id;
	}
	public String getColumn_name() {
		return column_name;
	}
	public void setColumn_name(String column_name) {
		this.column_name = column_name;
	}
	public int getColumn_group() {
		return column_group;
	}
	public void setColumn_group(int column_group) {
		this.column_group = column_group;
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
	public int getDelete_flag() {
		return delete_flag;
	}
	public void setDelete_flag(int delete_flag) {
		this.delete_flag = delete_flag;
	}
	public int getRow_id() {
		return row_id;
	}
	public void setRow_id(int row_id) {
		this.row_id = row_id;
	}
	public String getColumn_index() {
		return column_index;
	}
	public void setColumn_index(String column_index) {
		this.column_index = column_index;
	}
	public Column() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Column(int column_id, String column_name, int column_group,
			LocalDateTime add_time, String add_user, int add_user_id,
			int delete_flag, int row_id, String column_index) {
		super();
		this.column_id = column_id;
		this.column_name = column_name;
		this.column_group = column_group;
		this.add_time = add_time;
		this.add_user = add_user;
		this.add_user_id = add_user_id;
		this.delete_flag = delete_flag;
		this.row_id = row_id;
		this.column_index = column_index;
	}
	@Override
	public String toString() {
		return "Column [column_id=" + column_id + ", column_name="
				+ column_name + ", column_group=" + column_group
				+ ", add_time=" + add_time + ", add_user=" + add_user
				+ ", add_user_id=" + add_user_id + ", delete_flag="
				+ delete_flag + ", row_id=" + row_id + ", column_index="
				+ column_index + "]";
	}

	

	
}
