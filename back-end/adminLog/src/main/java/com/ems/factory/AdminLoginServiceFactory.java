package com.ems.factory;

import com.ems.service.AdminLoginService;
import com.ems.service.AdminLoginServiceImpl;

public class AdminLoginServiceFactory {
	private static AdminLoginService adminLoginService;
	static {
		adminLoginService=new AdminLoginServiceImpl();
	}
	public static AdminLoginService getAdminLoginService() {
		return adminLoginService;
	}
}
