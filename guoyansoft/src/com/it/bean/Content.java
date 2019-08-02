package com.it.bean;

import java.time.LocalDateTime;

public class Content {
	
	 private int content_id;
	 private int column_id;
	 private int group_id;
	 private String title;
	 private String subhead;
	 private String img_src;
	 private String video_src;
	 private String accessory;
	 private String content;
	 private int audit;
	 private int property;
	 private String label;
	 private String out_link;
	 private String add_user;
	 private LocalDateTime add_time;
	 private int add_user_id;
	 private int show_flag;
	 private int delete_flag;
	public int getContent_id() {
		return content_id;
	}
	public void setContent_id(int content_id) {
		this.content_id = content_id;
	}
	public int getColumn_id() {
		return column_id;
	}
	public void setColumn_id(int column_id) {
		this.column_id = column_id;
	}
	public int getGroup_id() {
		return group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubhead() {
		return subhead;
	}
	public void setSubhead(String subhead) {
		this.subhead = subhead;
	}
	public String getImg_src() {
		return img_src;
	}
	public void setImg_src(String img_src) {
		this.img_src = img_src;
	}
	public String getVideo_src() {
		return video_src;
	}
	public void setVideo_src(String video_src) {
		this.video_src = video_src;
	}
	public String getAccessory() {
		return accessory;
	}
	public void setAccessory(String accessory) {
		this.accessory = accessory;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getAudit() {
		return audit;
	}
	public void setAudit(int audit) {
		this.audit = audit;
	}
	public int getProperty() {
		return property;
	}
	public void setProperty(int property) {
		this.property = property;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getOut_link() {
		return out_link;
	}
	public void setOut_link(String out_link) {
		this.out_link = out_link;
	}
	public String getAdd_user() {
		return add_user;
	}
	public void setAdd_user(String add_user) {
		this.add_user = add_user;
	}
	public LocalDateTime getAdd_time() {
		return add_time;
	}
	public void setAdd_time(LocalDateTime add_time) {
		this.add_time = add_time;
	}
	public int getAdd_user_id() {
		return add_user_id;
	}
	public void setAdd_user_id(int add_user_id) {
		this.add_user_id = add_user_id;
	}
	public int getShow_flag() {
		return show_flag;
	}
	public void setShow_flag(int show_flag) {
		this.show_flag = show_flag;
	}
	public int getDelete_flag() {
		return delete_flag;
	}
	public void setDelete_flag(int delete_flag) {
		this.delete_flag = delete_flag;
	}
	public Content() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Content(int content_id, int column_id, int group_id, String title,
			String subhead, String img_src, String video_src, String accessory,
			String content, int audit, int property, String label,
			String out_link, String add_user, LocalDateTime add_time, int add_user_id,
			int show_flag, int delete_flag) {
		super();
		this.content_id = content_id;
		this.column_id = column_id;
		this.group_id = group_id;
		this.title = title;
		this.subhead = subhead;
		this.img_src = img_src;
		this.video_src = video_src;
		this.accessory = accessory;
		this.content = content;
		this.audit = audit;
		this.property = property;
		this.label = label;
		this.out_link = out_link;
		this.add_user = add_user;
		this.add_time = add_time;
		this.add_user_id = add_user_id;
		this.show_flag = show_flag;
		this.delete_flag = delete_flag;
	}
	@Override
	public String toString() {
		return "Content [content_id=" + content_id + ", column_id=" + column_id
				+ ", group_id=" + group_id + ", title=" + title + ", subhead="
				+ subhead + ", img_src=" + img_src + ", video_src=" + video_src
				+ ", accessory=" + accessory + ", content=" + content
				+ ", audit=" + audit + ", property=" + property + ", label="
				+ label + ", out_link=" + out_link + ", add_user=" + add_user
				+ ", add_time=" + add_time + ", add_user_id=" + add_user_id
				+ ", show_flag=" + show_flag + ", delete_flag=" + delete_flag
				+ "]";
	}
	 
}
