package com.ems.dao;

import com.ems.beans.Request;
import com.ems.beans.User;

public interface GetUserDetailsDao {
	public User getDetails(Request req);
}
