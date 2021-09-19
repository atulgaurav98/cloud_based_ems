package com.ems.dao;

import java.sql.Connection;
import java.sql.Statement;

import com.ems.beans.User;
import com.ems.factory.ConnectionFactory;
//UPDATE `empDB`.`employee_details` SET `euid` = '356700904058', `ename` = 'Atul Gaurav', `email` = 'atul.vampire@gmail.com', `econtact` = '7209221716', `edob` = '1998-08-07', `epass` = 'Atul Gaurav', `eaddr` = 'Dto', `edept` = 'HR', `eage` = '23', `edesg` = 'senior', `eblood` = 'o+', `egender` = 'male' WHERE (`euid` = '111');
public class RegisterUserDaoImpl implements RegisterUserDao {

	@Override
	public String regUser(User user) {
		String message="";
		try {
			Connection con=ConnectionFactory.getConnection();
			Statement st=con.createStatement();
			int rowCount=st.executeUpdate("insert into employee_details values ('"+user.getEuid()+"', '"+user.getEname()+"', '"+user.getEmail()+"', '"+user.getEcontact()+"', '"+user.getEdob()+"', '"+user.getEpass()+"', '"+user.getEbasicPay()+"', '"+user.getEda()+"', '"+user.getEhra()+"', '"+user.getEtax()+"', '"+user.getEaddr()+"', '"+user.getEdept()+"', '"+user.getEage()+"', '"+user.getEdesg()+"', '"+user.getEblood()+"', '"+user.getEgender()+"')");
			if(rowCount==1) {
				message="success";
			}else {
				message="failure";
			}
		} catch (Exception e) {
			message="failure due to connection issues";
			e.printStackTrace();
		}
		return message;
	}

}
