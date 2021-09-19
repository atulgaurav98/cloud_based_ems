package com.ems.controller;
import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.ems.beans.User;

import com.ems.factory.UserLoginServiceFactory;

import com.ems.service.UserLoginService;


public class UserLoginHandler implements RequestHandler<Map<String, String>, Map<String,String>>{
	User user;
	String message="";
	@Override
	public Map<String,String> handleRequest(Map<String, String> input, Context context) {
		
		user=new User();
		user.setEuid(input.get("euid"));
		user.setEpass(input.get("epass"));
		
		UserLoginService userLoginService=UserLoginServiceFactory.getuserLoginService();
		message=userLoginService.userLogin(user);
		Map<String,String> output=new HashMap<>();
		output.put("message", message);
		return output;
	}


}
