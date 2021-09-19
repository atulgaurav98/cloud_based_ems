package com.ems.factory;

import com.ems.dao.RegisterUserDao;
import com.ems.dao.RegisterUserDaoImpl;

public class RegisterUserDaoFactory {
	private static RegisterUserDao registerUserDao;
	static {
		registerUserDao=new RegisterUserDaoImpl();
	}
	public static RegisterUserDao getRegisterUserDao() {
		return registerUserDao;
	}
}
