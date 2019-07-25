package com.it.bean;
/**
 * 
 * 
 *Title:
* Description:com.it.bean.proj_0523_gjp.ZhangWu.java
* Copyright:Copyright (c) j2se 8.0
* Company: JavaWangc
* Datetime:2019年5月23日.下午7:57:19
* @author WangC
 */
public class ZhangWu {

	/*
	 * zwid INT PRIMARY KEY AUTO_INCREMENT,-- 主键列
  flname VARCHAR(200),-- 分类名称，做什么了
  money DOUBLE,-- 金额
  zhangHu VARCHAR(100),-- 账户，消费方法
  createtime DATE,-- 具体支付时间
  description VARCHAR(1000) -- 具体支出描述
	 */
	private int zwid;// id
	private String flname;// 分类名称
	private String zhangHu;// 账户名称
	private double money;// 金额
	private String createtime;// 创建时间
	private String description;// 说明
	public int getZwid() {
		return zwid;
	}
	public void setZwid(int zwid) {
		this.zwid = zwid;
	}
	public String getFlname() {
		return flname;
	}
	public void setFlname(String flname) {
		this.flname = flname;
	}
	public String getZhangHu() {
		return zhangHu;
	}
	public void setZhangHu(String zhangHu) {
		this.zhangHu = zhangHu;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "ZhangWu [zwid=" + zwid + ", flname=" + flname + ", zhangHu="
				+ zhangHu + ", money=" + money + ", createtime=" + createtime
				+ ", description=" + description + "]";
	}
	public ZhangWu(int zwid, String flname, String zhangHu, double money,
			String createtime, String description) {
		super();
		this.zwid = zwid;
		this.flname = flname;
		this.zhangHu = zhangHu;
		this.money = money;
		this.createtime = createtime;
		this.description = description;
	}
	public ZhangWu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
