package com.ems.factory;

import com.ems.dao.AdminLoginDao;
import com.ems.dao.AdminLoginDaoImpl;


public class AdminLoginDaoFactory {
	private static AdminLoginDao adminLoginDao;
	static {
		adminLoginDao=new AdminLoginDaoImpl();
	}
	public static AdminLoginDao getAdminLoginDao() {
		return adminLoginDao;
	}
}
