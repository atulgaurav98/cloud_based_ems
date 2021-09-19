package com.ems.factory;


import com.ems.dao.GetAllUserDao;
import com.ems.dao.GetAllUserDaoImpl;

public class GetAllUserDaoFactory {
	private static GetAllUserDao getAllUserDao;
	static {
		getAllUserDao=new GetAllUserDaoImpl();
	}
	public static GetAllUserDao getAllUserDao() {
		return getAllUserDao;
	}
}
