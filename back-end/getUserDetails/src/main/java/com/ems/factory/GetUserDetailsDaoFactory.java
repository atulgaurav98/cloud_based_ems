package com.ems.factory;

import com.ems.dao.GetUserDetailsDao;
import com.ems.dao.GetUserDetailsDaoImpl;

public class GetUserDetailsDaoFactory {
	private static GetUserDetailsDao getUserDetailsDao;
	static {
		getUserDetailsDao=new GetUserDetailsDaoImpl();
	}
	public static GetUserDetailsDao getGetUserDetailsDao() {
		return getUserDetailsDao;
	}
}
