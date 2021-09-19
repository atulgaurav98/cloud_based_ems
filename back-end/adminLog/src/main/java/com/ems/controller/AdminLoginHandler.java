package com.ems.controller;
import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.ems.beans.Admin;
import com.ems.factory.AdminLoginServiceFactory;
import com.ems.service.AdminLoginService;


public class AdminLoginHandler implements RequestHandler<Map<String, String>, Map<String,String>>{
	Admin admin;
	String message="";
	@Override
	public Map<String,String> handleRequest(Map<String, String> input, Context context) {
		
		admin=new Admin();
		admin.setAid(input.get("AID"));
		admin.setApass(input.get("APASS"));
		
		AdminLoginService adminLoginService=AdminLoginServiceFactory.getAdminLoginService();
		message=adminLoginService.adminLogin(admin);
		Map<String,String> output=new HashMap<>();
		output.put("message", message);
		return output;
	}


}
