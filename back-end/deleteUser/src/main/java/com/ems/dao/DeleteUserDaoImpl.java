package com.ems.dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;

import com.ems.beans.User;
import com.ems.factory.ConnectionFactory;

public class DeleteUserDaoImpl implements DeleteUserDao {

	@Override
	public String delete(User user) {
		String message="";
		try {
			Connection con=ConnectionFactory.getConnection();
			Statement st=con.createStatement();
			int rowCount=st.executeUpdate("DELETE FROM employee_details WHERE euid='"+user.getEuid()+"'");
			
			if(rowCount==1) {
				message="success";
			}else {
				message="failure";
			}
		} catch (Exception e) {
			message="failure due to connection issue";
			e.printStackTrace();
		}
		return message;
	}

}
