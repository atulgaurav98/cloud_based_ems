package com.ems.service;

import com.ems.beans.Admin;
import com.ems.dao.AdminLoginDao;
import com.ems.factory.AdminLoginDaoFactory;

public class AdminLoginServiceImpl implements AdminLoginService {

	@Override
	public String adminLogin(Admin admin) {
		AdminLoginDao adminLoginDao=AdminLoginDaoFactory.getAdminLoginDao();
		String message=adminLoginDao.adminLogin(admin);
		return message;
	}

}
