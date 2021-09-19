package com.ems.service;

import com.ems.beans.Request;
import com.ems.beans.User;
import com.ems.dao.GetUserDetailsDao;
import com.ems.factory.GetUserDetailsDaoFactory;


public class GetUserDetailsServiceImpl implements GetUserDetailsService{

	@Override
	public User getDetails(Request req) {
		GetUserDetailsDao getUserDetailsDao=GetUserDetailsDaoFactory.getGetUserDetailsDao();
		
		User user=getUserDetailsDao.getDetails(req);
		//System.out.println(user.getEaddr());
		return user;
	}

}
