package com.springboot.naverlogin.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.naverlogin.model.User;
import com.springboot.naverlogin.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repo;

	@Override
	public void insert(User user) {
		
		repo.save(user);
		
	}
	
	
}
