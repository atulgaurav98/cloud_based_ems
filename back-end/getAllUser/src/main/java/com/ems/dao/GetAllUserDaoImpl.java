package com.ems.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;


import com.ems.beans.User;
import com.ems.factory.ConnectionFactory;

public class GetAllUserDaoImpl implements GetAllUserDao {

	@Override
	public ArrayList<User> getAll() {
		User user;
		String message="";
		ArrayList<User> usr=new ArrayList<>();
		try {
			Connection con=ConnectionFactory.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employee_details");
			
			while(rs.next()) {
				user=new User();
				message="success";
				user.setStatus(message);
				user.setEuid(rs.getString("euid"));
				user.setEname(rs.getString("ename"));
				user.setEmail(rs.getString("email"));
				user.setEcontact(rs.getString("econtact"));
				java.sql.Date dbSqlDate = rs.getDate("edob");
				int year=dbSqlDate.getYear();
				int month=dbSqlDate.getMonth();
				int day=dbSqlDate.getDate();
				String temp=(1900+year)+"-"+(month+1)+"-"+day;
				
				user.setEdob(temp);
				user.setEpass(rs.getString("epass"));
				user.setEbasicPay(rs.getDouble("ebasicPay"));
				user.setEda(rs.getDouble("eda"));
				user.setEhra(rs.getDouble("ehra"));
				user.setEtax(rs.getDouble("etax"));
				user.setEaddr(rs.getString("eaddr"));
				user.setEdept(rs.getString("edept"));
				user.setEage(rs.getString("eage"));
				user.setEdesg(rs.getString("edesg"));
				user.setEblood(rs.getString("eblood"));
				user.setEgender(rs.getString("egender"));
				usr.add(user);
			}
			message="failure";
			user=new User();
			user.setStatus(message);
			usr.add(user);
		} catch (Exception e) {
			message="failure";
			user=new User();
			user.setStatus(message);
			usr.add(user);
			e.printStackTrace();
		}
		return usr;
	}

}
