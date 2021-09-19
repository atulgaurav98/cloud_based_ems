package com.ems.controller;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import com.ems.beans.User;
import com.ems.factory.UpdateUserDetailsServiceFactory;

import com.ems.service.UpdateUserDetailsService;


public class UpdateUserDetailsHandler implements RequestHandler<Map<String, String>, Map<String,String>>{
	
	@Override
	public Map<String, String> handleRequest(Map<String, String> input, Context context) {
		String message="";
		User user;
		Map<String, String> output=new HashMap<String, String>();
		user=new User();
		user.setEuid(input.get("euid"));
		user.setEname(input.get("ename"));
		user.setEmail(input.get("email"));
		user.setEcontact(input.get("econtact"));
		Date d=new Date(Long.parseLong(input.get("edob")));
		java.sql.Date sqld=new java.sql.Date(d.getTime());
		user.setEdob(sqld);
		
		user.setEpass(input.get("epass"));
		user.setEbasicPay(Double.parseDouble(input.get("ebasicPay")));
		user.setEda(Double.parseDouble(input.get("eda")));
		user.setEhra(Double.parseDouble(input.get("ehra")));
		user.setEtax(Double.parseDouble(input.get("etax")));
		user.setEaddr(input.get("eaddr"));
		user.setEdept(input.get("edept"));
		user.setEage(input.get("eage"));
		user.setEdesg(input.get("edesg"));
		user.setEblood(input.get("eblood"));
		user.setEgender(input.get("egender"));
		
		UpdateUserDetailsService updateUserDetailsService=UpdateUserDetailsServiceFactory.updateUserDetailsService();
		message=updateUserDetailsService.updateDetails(user);
		
		output.put("status", message);
		return output;
	}


}
