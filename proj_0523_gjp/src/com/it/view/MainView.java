package com.it.view;

import java.util.List;
import java.util.Scanner;

import com.it.bean.ZhangWu;
import com.it.service.ZhangWuService;
import com.it.service.ZhangWuService;
/**
 * 
 * 
 *Title:
* Description:com.it.view.proj_0523_gjp.MainView.java
* Copyright:Copyright (c) j2se 8.0
* Company: JavaWangc
* Datetime:2019年5月23日.下午8:53:34
* @author WangC
 */
public class MainView {

	ZhangWuService zhangWuService = new ZhangWuService();
	
	//首页菜单
	public void run() {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while (flag) {
			System.out.println("---------------管家婆家庭记账软件---------------");
			System.out.println("1.添加账务　2.编辑账务　3.删除账务　4.查询账务　5.退出系统");
			System.out.println("请输入要操作的功能序号[1-5]:");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				addZhangWu();
				break;
			case 2:
				updZhangWu();
				break;
			case 3:
				delZhangWu();
				break;
			case 4:
				selectZhangWu();
				break;
			case 5:
				System.out.println("系统退出！");
				flag = false;
				break;
			default:
				System.out.println("输入错误！");
			}
		}
	}
	
	//查询账务菜单
	public void selectZhangWu() {
		System.out.println("1.查询所有　2.按条件查询");
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		switch (op) {
		case 1:
			selectAll();
			break;
		case 2:
			select();
			break;
		default:
			System.out.println("输入错误！");
		}
	}
	
	//打印
	private void print(List<ZhangWu> zhangWuList) {
		System.out.println("ID\t类别\t\t账户\t\t金额\t\t时间\t\t说明");
		for (ZhangWu zw : zhangWuList) {
			System.out.println(zw.getZwid() + "\t" + zw.getFlname() + "\t\t"
					+ zw.getZhangHu() + "\t\t" + zw.getMoney() + "\t\t"
					+ zw.getCreatetime() + "\t" + zw.getDescription());
		}
	}
	
	//查询所有
	public void selectAll() {
		List<ZhangWu> zhangWuList = zhangWuService.selectAll();
		print(zhangWuList);
	}
	
	//按条件查询
	public void select() {
		
		Scanner in = new Scanner(System.in);
		System.out.print("请输入查询起始时间：");
		String start = in.next();
		System.out.print("请输入查询结束时间：");
		String end = in.next();
		List<ZhangWu> zhangWuList = zhangWuService.select(start, end);
		print(zhangWuList);
	}
	
	//添加
	public void addZhangWu() {
		
		Scanner in = new Scanner(System.in);
		ZhangWu zw = new ZhangWu();
		System.out.print("请输入类别：");
		zw.setFlname(in.next());
		System.out.print("请输入账户：");
		zw.setZhangHu(in.next());
		System.out.print("请输入金额：");
		zw.setMoney(in.nextDouble());
		System.out.print("请输入时间：");
		zw.setCreatetime(in.next());
		System.out.print("请输入说明：");
		zw.setDescription(in.next());
		zhangWuService.addZhangWu(zw);
		System.out.println("添加账务成功！");
	}
	
	//修改
	public void updZhangWu() {
		Scanner in = new Scanner(System.in);
		ZhangWu zw = new ZhangWu();
		System.out.print("请输入ID：");
		zw.setZwid(in.nextInt());
		System.out.print("请输入新类别：");
		zw.setFlname(in.next());
		System.out.print("请输入新账户：");
		zw.setZhangHu(in.next());
	System.out.print("请输入新金额：");
		zw.setMoney(in.nextDouble());
		System.out.print("请输入新时间：");
		zw.setCreatetime(in.next());
		System.out.print("请输入新说明：");
		zw.setDescription(in.next());
		
		zhangWuService.updZhangWu(zw);
		System.out.println("修改账务成功！");
	}
	
	//删除
	public void delZhangWu() {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入ID：");
		
		zhangWuService.delZhangWu(in.nextInt());
		System.out.println("删除账务成功！");
	}
}
