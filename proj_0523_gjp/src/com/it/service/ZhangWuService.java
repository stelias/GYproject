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
* Datetime:2019年5月23日.下午9:09:52
* @author WangC
 */
public class ZhangWuService {

	ZhangWuDAO zhangWuDao = new ZhangWuDAO();

	//查询所有
	public List<ZhangWu> selectAll() {
		return zhangWuDao.selectAll();
	}
	
	//按条件查询
	public List<ZhangWu> select(String start, String end) {
		return zhangWuDao.select(start, end);
	}

	//添加账务
	public void addZhangWu(ZhangWu zw) {
		zhangWuDao.addZhangWu(zw);
	}
	
	//编辑账务
		public void updZhangWu(ZhangWu zw) {
		zhangWuDao.updZhangWu(zw);
	}
		
	//删除账务
		public void delZhangWu(int zwid) {
			zhangWuDao.delZhangWu(zwid);
		}	
}
