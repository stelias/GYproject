package com.it.bean;

import java.time.LocalDateTime;

/*
 * 
 secondary_cloumn_id		int(11) NOT NULL次级栏目主键ID
 secondary_cloumn_name	varchar(255) NOT NULL次级栏目名称
 column_id				int(11) NOT NULL栏目表主键
 add_time				datetime NOT NULL添加时间
 add_user				varchar(255) NULL添加人
 add_user_id				int(11) NULL添加人 ID
 row_id					int(11) NOT NULL行数
 delete_flag				bigint(1) NOT NULL删除？0 否 1是
 secondary_column_group	int(11) NOT NULL栏目分组1 not ,2 nav,3 not + nav
 secondary_column_index	varchar(255) NOT NULL栏目索引
 */
public class Secondary_column {

	private int secondary_cloumn_id;
	private String secondary_cloumn_name;
	private int column_id;
	private LocalDateTime add_time;
	private String add_user;
	private int add_user_id;
	private int row_id;
	private int delete_flag;
	private int secondary_column_group;
	private String secondary_column_index;
	public int getSecondary_cloumn_id() {
		return secondary_cloumn_id;
	}
	public void setSecondary_cloumn_id(int secondary_cloumn_id) {
		this.secondary_cloumn_id = secondary_cloumn_id;
	}
	public String getSecondary_cloumn_name() {
		return secondary_cloumn_name;
	}
	public void setSecondary_cloumn_name(String secondary_cloumn_name) {
		this.secondary_cloumn_name = secondary_cloumn_name;
	}
	public int getColumn_id() {
		return column_id;
	}
	public void setColumn_id(int column_id) {
		this.column_id = column_id;
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
	public int getRow_id() {
		return row_id;
	}
	public void setRow_id(int row_id) {
		this.row_id = row_id;
	}
	public int getDelete_flag() {
		return delete_flag;
	}
	public void setDelete_flag(int delete_flag) {
		this.delete_flag = delete_flag;
	}
	public int getSecondary_column_group() {
		return secondary_column_group;
	}
	public void setSecondary_column_group(int secondary_column_group) {
		this.secondary_column_group = secondary_column_group;
	}
	public String getSecondary_column_index() {
		return secondary_column_index;
	}
	public void setSecondary_column_index(String secondary_column_index) {
		this.secondary_column_index = secondary_column_index;
	}
	public Secondary_column() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Secondary_column(int secondary_cloumn_id,
			String secondary_cloumn_name, int column_id,
			LocalDateTime add_time, String add_user, int add_user_id,
			int row_id, int delete_flag, int secondary_column_group,
			String secondary_column_index) {
		super();
		this.secondary_cloumn_id = secondary_cloumn_id;
		this.secondary_cloumn_name = secondary_cloumn_name;
		this.column_id = column_id;
		this.add_time = add_time;
		this.add_user = add_user;
		this.add_user_id = add_user_id;
		this.row_id = row_id;
		this.delete_flag = delete_flag;
		this.secondary_column_group = secondary_column_group;
		this.secondary_column_index = secondary_column_index;
	}
	@Override
	public String toString() {
		return "Secondary_column [secondary_cloumn_id=" + secondary_cloumn_id
				+ ", secondary_cloumn_name=" + secondary_cloumn_name
				+ ", column_id=" + column_id + ", add_time=" + add_time
				+ ", add_user=" + add_user + ", add_user_id=" + add_user_id
				+ ", row_id=" + row_id + ", delete_flag=" + delete_flag
				+ ", secondary_column_group=" + secondary_column_group
				+ ", secondary_column_index=" + secondary_column_index + "]";
	}
	
	
}
