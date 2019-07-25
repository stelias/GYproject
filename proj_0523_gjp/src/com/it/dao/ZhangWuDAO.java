package com.it.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.it.bean.ZhangWu;
import com.it.utils.JDBCUtils;
/**
 * 
 * 
 *Title:
* Description:com.it.dao.proj_0523_gjp.ZhangWuDAO.java
* Copyright:Copyright (c) j2se 8.0
* Company: JavaWangc
* Datetime:2019��5��23��.����9:02:53
* @author WangC
 */
public class ZhangWuDAO  {

	QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());

	//��ѯ��������
	public List<ZhangWu> selectAll() {
		String sql = "select * from gjp_zhangwu";
		try {
			return qr.query(sql, new BeanListHandler<ZhangWu>(ZhangWu.class));
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	//��������ѯ
	public List<ZhangWu> select(String start, String end) {
		String sql = "select * from gjp_zhangwu where createtime between ? and ?";
		Object[] params = {start, end};
		try {
			return qr.query(sql, new BeanListHandler<ZhangWu>(ZhangWu.class), params);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	//�������
	public void addZhangWu(ZhangWu zw) {
		String sql = "insert into gjp_zhangwu(flname,money,zhanghu,createtime,description) values(?,?,?,?,?)";
		try {
			Object[] params = {zw.getFlname(),zw.getMoney(),zw.getZhangHu(),zw.getCreatetime(),zw.getDescription()};
			qr.update(sql, params);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}	
	}
	
	//�޸�����
	public void updZhangWu(ZhangWu zw) {
		String sql = "update gjp_zhangwu set flname=?, money=?,zhanghu=?,createtime=?,description=? where zwid=?";
		try {
			Object[] params = {zw.getFlname(),zw.getMoney(),zw.getZhangHu(),zw.getCreatetime(),zw.getDescription(),zw.getZwid()};
			qr.update(sql, params);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}	
	}
	
	//ɾ��
	public void delZhangWu(int zwid) {
		String sql = "delete from gjp_zhangwu where zwid=?";
		try {
			qr.update(sql, zwid);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
