package com.ems.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import com.ems.beans.User;
import com.ems.factory.GetAllUserServiceFactory;

import com.ems.service.GetAllUserService;
public class GetAllUserHandler implements RequestHandler<Map<String, String>, Map<String,ArrayList<User>>>{
	
	@Override
	public Map<String,ArrayList<User>> handleRequest(Map<String, String> input, Context context) {
		ArrayList<User> user;
		Map<String,ArrayList<User>> output=new HashMap<>();
		GetAllUserService getAllUserService=GetAllUserServiceFactory.getAllUserService();
		user=getAllUserService.getAll();
		output.put("body", user);
		return output;
	}


}
