package com.ems.factory;

import com.ems.service.DeleteUserService;
import com.ems.service.DeleteUserServiceImpl;

public class DeleteUserServiceFactory {
	private static DeleteUserService deleteUserService;
	static {
		deleteUserService=new DeleteUserServiceImpl();
	}
	public static DeleteUserService getDeleteUserService() {
		return deleteUserService;
	}
}
