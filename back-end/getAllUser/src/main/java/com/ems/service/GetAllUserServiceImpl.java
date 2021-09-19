package com.ems.service;

import java.util.ArrayList;

import com.ems.beans.User;
import com.ems.dao.GetAllUserDao;
import com.ems.factory.GetAllUserDaoFactory;


public class GetAllUserServiceImpl implements GetAllUserService{

	@Override
	public ArrayList<User> getAll() {
		GetAllUserDao getAllUserDao=GetAllUserDaoFactory.getAllUserDao();
		ArrayList<User> user=getAllUserDao.getAll();
		return user;
		
	}

}
