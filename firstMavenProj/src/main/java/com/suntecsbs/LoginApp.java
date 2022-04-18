package com.suntecsbs;

import java.util.ResourceBundle;

public class LoginApp {
	
	public int credCheck(String uname, String pwd) {
	ResourceBundle rb =  ResourceBundle.getBundle("config");
	
	String username = rb.getString("username");
	String password  = rb.getString("password");	
	
	if(uname.equals(username)&& pwd.equals(password))
		return 1;
	else
	
	return 0;
	
	

}
}
