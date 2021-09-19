package com.ems.factory;


import com.ems.service.GetAllUserService;
import com.ems.service.GetAllUserServiceImpl;

public class GetAllUserServiceFactory {
	private static GetAllUserService getAllUserService;
	static {
		getAllUserService=new GetAllUserServiceImpl();
	}
	public static GetAllUserService getAllUserService() {
		return getAllUserService;
	}
}
