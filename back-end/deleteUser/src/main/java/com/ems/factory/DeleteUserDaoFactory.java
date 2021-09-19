package com.ems.factory;

import com.ems.dao.DeleteUserDao;
import com.ems.dao.DeleteUserDaoImpl;

public class DeleteUserDaoFactory {
	private static DeleteUserDao deleteUserDao;
	static {
		deleteUserDao=new DeleteUserDaoImpl();
	}
	public static DeleteUserDao getDeleteUserDao() {
		return deleteUserDao;
	}
}
