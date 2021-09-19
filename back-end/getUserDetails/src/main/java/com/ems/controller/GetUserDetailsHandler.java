package com.ems.controller;
import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.ems.beans.Request;
import com.ems.beans.User;
import com.ems.factory.GetUserDetailsServiceFactory;

import com.ems.service.GetUserDetailsService;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.JsonAdapter;


public class GetUserDetailsHandler implements RequestHandler<Map<String, String>, /*Map<String,Object>*/User>{
	Request req;
	String message="";
	User user;
	@Override
	public /*Map<String, Object>*/User handleRequest(Map<String, String> input, Context context) {
		
		req=new Request();
		req.setEuid(input.get("euid"));
		Map<String,Object> output=new HashMap<>();
		
		GetUserDetailsService getUserDetailsService=GetUserDetailsServiceFactory.getUserDetailsService();
		user=getUserDetailsService.getDetails(req);
		if(user.getStatus().equalsIgnoreCase("success")) {
		output.put("euid", user.getEuid());
		output.put("ename", user.getEname());
		output.put("email", user.getEmail());
		output.put("econtact", user.getEcontact());
		output.put("edob", user.getEdob());
		output.put("epass", user.getEdob());
		output.put("epass", user.getEpass());
		output.put("ebasicPay", user.getEbasicPay());
		output.put("eda", user.getEda());
		output.put("ehra", user.getEhra());
		output.put("etax", user.getEtax());
		output.put("eaddr", user.getEaddr());
		output.put("edept", user.getEdept());
		output.put("eage", user.getEage());
		output.put("edesg", user.getEdesg());
		output.put("eblood", user.getEblood());
		output.put("egender", user.getEgender());
		}else {
			message="failure";
			output.put("message", message);
		}
		//return output;
		return user;
	}


}
