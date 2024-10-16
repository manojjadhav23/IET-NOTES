package com.demo.service;

public class LoginServiceImpl implements LoginService {

	@Override
	public String autheticate(String uname, String pass) {
		// TODO Auto-generated method stub
		if((uname.equals("user"))&& (pass.equals("user"))) {
			return uname;
		}
		else {
			return null;
		}
	}

}
