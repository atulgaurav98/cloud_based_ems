package com.ems.service;

import com.ems.beans.User;
import com.ems.dao.RegisterUserDao;
import com.ems.factory.RegisterUserDaoFactory;

public class RegisterUserServiceImpl implements RegisterUserService {

	@Override
	public String regUser(User user) {
		RegisterUserDao registerUserDao=RegisterUserDaoFactory.getRegisterUserDao();
		String msg=registerUserDao.regUser(user);
		return msg;
	}

}
