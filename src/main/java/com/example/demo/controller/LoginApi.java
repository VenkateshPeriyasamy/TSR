package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.LoginDTO;
import com.example.demo.repo.Login;

@RequestMapping("")
@Controller

public class LoginApi {

	private final Login loginrepo;

	@Autowired
	public LoginApi(Login loginrepo) {
		this.loginrepo = loginrepo;
	}

	@RequestMapping(path = "/adminapi", method = RequestMethod.POST)
	@ResponseBody

	public String Logincontroller(String username, String password) {

		LoginDTO loginclass = loginrepo.findByUsername(username);

		if (loginclass != null) {
			if (loginclass.getPassword().equalsIgnoreCase(password)) {
				return "index";
			}
		}
		return "admin_details";

	}
}
