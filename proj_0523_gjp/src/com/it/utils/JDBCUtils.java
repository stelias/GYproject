package com.it.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

/**
 * 
 * 
 *Title:�����������������ӳ�
* Description:com.it.utils.proj_0522_student.JDBCUtils.java
* Copyright:Copyright (c) j2se 8.0
* Company: JavaWangc
* Datetime:2019��5��22��.����11:13:48
* @author WangC
 */
public class JDBCUtils {

	private static String driver;
	private static String url;
	private static String user;
	private static String pwd;
	
	//�������ӳ�
	public static BasicDataSource dataSource = new BasicDataSource();
	
	static{
		Properties properties = new Properties();
		
		try {
			properties.load(new FileReader(System.getProperty("user.dir")+"\\src\\db.properties"));
		
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			pwd = properties.getProperty("pwd");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dataSource.setDriverClassName(driver);
		dataSource.setUrl(url);
		dataSource.setUsername(user);
		dataSource.setPassword(pwd);
		
		dataSource.setMaxActive(10);
		dataSource.setMaxIdle(5);
		dataSource.setMinIdle(2);
		
	}
	
	//�������ӳ�
	public static BasicDataSource getDataSource(){
		return dataSource;
	}
	
	
}
