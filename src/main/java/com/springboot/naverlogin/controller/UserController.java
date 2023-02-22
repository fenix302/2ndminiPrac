package com.springboot.naverlogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.naverlogin.impl.UserService;
import com.springboot.naverlogin.model.User;

@CrossOrigin
@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@RequestMapping(value = "/login.do")
	public void insert(User user) {
		service.insert(user);
	}
	
}
