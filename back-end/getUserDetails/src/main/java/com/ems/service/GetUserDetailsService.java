package com.ems.service;

import com.ems.beans.User;
import com.ems.beans.Request;
public interface GetUserDetailsService {
	public User getDetails(Request req);
}
