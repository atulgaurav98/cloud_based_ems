package com.ems.service;

import com.ems.beans.User;
import com.ems.dao.DeleteUserDao;
import com.ems.factory.DeleteUserDaoFactory;


public class DeleteUserServiceImpl implements DeleteUserService {

	@Override
	public String delete(User user) {
		DeleteUserDao deleteUserDao=DeleteUserDaoFactory.getDeleteUserDao();
		String msg=deleteUserDao.delete(user);
		return msg;
	}

}
