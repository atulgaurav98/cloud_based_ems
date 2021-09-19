package tester;

import java.util.HashMap;
import java.util.Map;

import com.ems.beans.Request;
import com.ems.beans.User;
import com.ems.factory.GetUserDetailsServiceFactory;
import com.ems.service.GetUserDetailsService;
import com.google.gson.Gson;


public class Test{

	public static void main(String[] args) {
		User user=new User();
		Request req=new Request();
		String message="";
		req.setEuid("111");
		Map<String,Object> output=new HashMap<>();
		GetUserDetailsService getUserDetailsService=GetUserDetailsServiceFactory.getUserDetailsService();
		user=getUserDetailsService.getDetails(req);
		if(user.getStatus().equalsIgnoreCase("success")) {
			output.put("euid", user.getEuid());
			output.put("ename", user.getEname());
			output.put("email", user.getEmail());
			output.put("econtact", user.getEcontact());
			output.put("edob", user.getEdob());
			output.put("epass", user.getEdob());
			output.put("epass", user.getEpass());
			output.put("ebasicPay", user.getEbasicPay());
			output.put("eda", user.getEda());
			output.put("ehra", user.getEhra());
			output.put("etax", user.getEtax());
			output.put("eaddr", user.getEaddr());
			output.put("edept", user.getEdept());
			output.put("eage", user.getEage());
			output.put("edesg", user.getEdesg());
			output.put("eblood", user.getEblood());
			output.put("egender", user.getEgender());
			}else {
				message="failure";
				output.put("message", message);
			}
		System.out.println(output);
	}
}



//below is different approach
//		//System.out.println(user.getEaddr());
//		String resp=new Gson().toJson(user);
//		output.put("data", user);
//		System.out.println(resp);
//		String value = resp;
//		value = value.substring(1, value.length()-1);           //remove curly brackets
//		String[] keyValuePairs = value.split(",");              //split the string to creat key-value pairs
//		Map<String,String> map = new HashMap<>();               
//		
//		for(String pair : keyValuePairs)                        //iterate over the pairs
//		{
//			System.out.println(pair);
//		    String[] entry = pair.split("=");                   //split the pairs to get key and value 
//		    map.put(entry[0], entry[1]);          //add them to the hashmap and trim whitespaces
//		}
//		System.out.println(map);
//	}
//
//}
