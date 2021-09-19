package com.ems.dao;

import java.sql.Connection;
import java.sql.Statement;

import com.ems.beans.User;
import com.ems.factory.ConnectionFactory;

public class UpdateUserDetailsDaoImpl implements UpdateUserDetailsDao {

	@Override
	public String updateDetails(User user) {
		String message="";
		try {
			Connection con=ConnectionFactory.getConnection();
			Statement st=con.createStatement();
			int rowCount=st.executeUpdate("UPDATE employee_details SET euid='"+user.getEuid()+"',ename='"+user.getEname()+"',email='"+user.getEmail()+"',econtact='"+user.getEcontact()+"',edob='"+user.getEdob()+"',epass='"+user.getEpass()+"',ebasicPay='"+user.getEbasicPay()+"',eda='"+user.getEda()+"',ehra='"+user.getEhra()+"',etax='"+user.getEtax()+"',eaddr='"+user.getEaddr()+"',edept='"+user.getEdept()+"',eage='"+user.getEage()+"',edesg='"+user.getEdesg()+"',eblood='"+user.getEblood()+"',egender='"+user.getEgender()+"' WHERE euid='"+user.getEuid()+"'");
			if(rowCount==1) {
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
