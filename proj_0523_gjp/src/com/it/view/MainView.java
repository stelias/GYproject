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
* Datetime:2019��5��23��.����8:53:34
* @author WangC
 */
public class MainView {

	ZhangWuService zhangWuService = new ZhangWuService();
	
	//��ҳ�˵�
	public void run() {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while (flag) {
			System.out.println("---------------�ܼ��ż�ͥ�������---------------");
			System.out.println("1.�������2.�༭����3.ɾ������4.��ѯ����5.�˳�ϵͳ");
			System.out.println("������Ҫ�����Ĺ������[1-5]:");
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
				System.out.println("ϵͳ�˳���");
				flag = false;
				break;
			default:
				System.out.println("�������");
			}
		}
	}
	
	//��ѯ����˵�
	public void selectZhangWu() {
		System.out.println("1.��ѯ���С�2.��������ѯ");
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
			System.out.println("�������");
		}
	}
	
	//��ӡ
	private void print(List<ZhangWu> zhangWuList) {
		System.out.println("ID\t���\t\t�˻�\t\t���\t\tʱ��\t\t˵��");
		for (ZhangWu zw : zhangWuList) {
			System.out.println(zw.getZwid() + "\t" + zw.getFlname() + "\t\t"
					+ zw.getZhangHu() + "\t\t" + zw.getMoney() + "\t\t"
					+ zw.getCreatetime() + "\t" + zw.getDescription());
		}
	}
	
	//��ѯ����
	public void selectAll() {
		List<ZhangWu> zhangWuList = zhangWuService.selectAll();
		print(zhangWuList);
	}
	
	//��������ѯ
	public void select() {
		
		Scanner in = new Scanner(System.in);
		System.out.print("�������ѯ��ʼʱ�䣺");
		String start = in.next();
		System.out.print("�������ѯ����ʱ�䣺");
		String end = in.next();
		List<ZhangWu> zhangWuList = zhangWuService.select(start, end);
		print(zhangWuList);
	}
	
	//���
	public void addZhangWu() {
		
		Scanner in = new Scanner(System.in);
		ZhangWu zw = new ZhangWu();
		System.out.print("���������");
		zw.setFlname(in.next());
		System.out.print("�������˻���");
		zw.setZhangHu(in.next());
		System.out.print("�������");
		zw.setMoney(in.nextDouble());
		System.out.print("������ʱ�䣺");
		zw.setCreatetime(in.next());
		System.out.print("������˵����");
		zw.setDescription(in.next());
		zhangWuService.addZhangWu(zw);
		System.out.println("�������ɹ���");
	}
	
	//�޸�
	public void updZhangWu() {
		Scanner in = new Scanner(System.in);
		ZhangWu zw = new ZhangWu();
		System.out.print("������ID��");
		zw.setZwid(in.nextInt());
		System.out.print("�����������");
		zw.setFlname(in.next());
		System.out.print("���������˻���");
		zw.setZhangHu(in.next());
	System.out.print("�������½�");
		zw.setMoney(in.nextDouble());
		System.out.print("��������ʱ�䣺");
		zw.setCreatetime(in.next());
		System.out.print("��������˵����");
		zw.setDescription(in.next());
		
		zhangWuService.updZhangWu(zw);
		System.out.println("�޸�����ɹ���");
	}
	
	//ɾ��
	public void delZhangWu() {
		Scanner in = new Scanner(System.in);
		System.out.print("������ID��");
		
		zhangWuService.delZhangWu(in.nextInt());
		System.out.println("ɾ������ɹ���");
	}
}
