package com.it.bean;
/**
 * 
 * 
 *Title:
* Description:com.it.bean.proj_0523_gjp.ZhangWu.java
* Copyright:Copyright (c) j2se 8.0
* Company: JavaWangc
* Datetime:2019��5��23��.����7:57:19
* @author WangC
 */
public class ZhangWu {

	/*
	 * zwid INT PRIMARY KEY AUTO_INCREMENT,-- ������
  flname VARCHAR(200),-- �������ƣ���ʲô��
  money DOUBLE,-- ���
  zhangHu VARCHAR(100),-- �˻������ѷ���
  createtime DATE,-- ����֧��ʱ��
  description VARCHAR(1000) -- ����֧������
	 */
	private int zwid;// id
	private String flname;// ��������
	private String zhangHu;// �˻�����
	private double money;// ���
	private String createtime;// ����ʱ��
	private String description;// ˵��
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
