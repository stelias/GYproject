package com.it.service;

import java.util.List;

import com.it.bean.ZhangWu;
import com.it.dao.ZhangWuDAO;
/**
 * 
 * 
 *Title:
* Description:com.it.service.proj_0523_gjp.ZhangWuService.java
* Copyright:Copyright (c) j2se 8.0
* Company: JavaWangc
* Datetime:2019��5��23��.����9:09:52
* @author WangC
 */
public class ZhangWuService {

	ZhangWuDAO zhangWuDao = new ZhangWuDAO();

	//��ѯ����
	public List<ZhangWu> selectAll() {
		return zhangWuDao.selectAll();
	}
	
	//��������ѯ
	public List<ZhangWu> select(String start, String end) {
		return zhangWuDao.select(start, end);
	}

	//�������
	public void addZhangWu(ZhangWu zw) {
		zhangWuDao.addZhangWu(zw);
	}
	
	//�༭����
		public void updZhangWu(ZhangWu zw) {
		zhangWuDao.updZhangWu(zw);
	}
		
	//ɾ������
		public void delZhangWu(int zwid) {
			zhangWuDao.delZhangWu(zwid);
		}	
}
