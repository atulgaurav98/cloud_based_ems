package com.ems.factory;

import com.ems.service.GetUserDetailsService;
import com.ems.service.GetUserDetailsServiceImpl;

public class GetUserDetailsServiceFactory {
	private static GetUserDetailsService getUserDetailsService;
	static {
		getUserDetailsService=new GetUserDetailsServiceImpl();
	}
	public static GetUserDetailsService getUserDetailsService() {
		return getUserDetailsService;
	}
}
