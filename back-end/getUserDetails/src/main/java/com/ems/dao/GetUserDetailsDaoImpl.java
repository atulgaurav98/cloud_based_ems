package com.ems.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.ems.beans.Request;
import com.ems.beans.User;
import com.ems.factory.ConnectionFactory;

public class GetUserDetailsDaoImpl implements GetUserDetailsDao {

	@Override
	public User getDetails(Request req) {
		User user=new User();
		try {
			Connection con=ConnectionFactory.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employee_details where euid='"+req.getEuid()+"'");
			boolean b=rs.next();
			if(b==true) {
				user.setStatus("success");
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
			//System.out.println(user.getEaddr());
			
			}else {
				user.setStatus("failure");
			}
			
			
		} catch (Exception e) {
			//System.out.println("failure data not returned");
			e.printStackTrace();
		}
		return user;
	}

}
