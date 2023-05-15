package com.example.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean Authenticate(String username, String password) {
		boolean isvaliduser = username.equalsIgnoreCase("chittu");
		boolean isvalidpassword = password.equals("dummy");
		return isvaliduser && isvalidpassword;
	}
}
