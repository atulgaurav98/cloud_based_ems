package com.ems.factory;

import com.ems.service.RegisterUserService;
import com.ems.service.RegisterUserServiceImpl;

public class RegisterUserServiceFactory {
	private static RegisterUserService registerUserService;
	static {
		registerUserService=new RegisterUserServiceImpl();
	}
	public static RegisterUserService getRegisterUserService() {
		return registerUserService;
	}
}
