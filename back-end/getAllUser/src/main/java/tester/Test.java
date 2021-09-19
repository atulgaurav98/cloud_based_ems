package tester;

import java.util.ArrayList;



import com.ems.beans.User;
import com.ems.factory.GetAllUserServiceFactory;

import com.ems.service.GetAllUserService;



public class Test{

	public static void main(String[] args) {
		ArrayList<User> user;
		GetAllUserService getAllUserService=GetAllUserServiceFactory.getAllUserService();
		user=getAllUserService.getAll();
		for (User usr : user) {
			System.out.println(usr);
		}
	}
}



