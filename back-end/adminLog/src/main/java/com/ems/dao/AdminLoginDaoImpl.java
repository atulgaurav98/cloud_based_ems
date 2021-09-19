package com.ems.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ems.beans.Admin;
import com.ems.factory.ConnectionFactory;

public class AdminLoginDaoImpl implements AdminLoginDao {

	@Override
	public String adminLogin(Admin admin) {
		String message="";
		try {
			Connection con=ConnectionFactory.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from admin where AID='"+admin.getAid()+"' and APASS='"+admin.getApass()+"'");
			boolean b=rs.next();
			if(b==true) {
				message="success";
			}else {
				message="failure";
			}
		} catch (Exception e) {
			message="failure";
			e.printStackTrace();
		}
		return message;
	}

}
