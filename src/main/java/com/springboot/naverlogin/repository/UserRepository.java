package com.springboot.naverlogin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.naverlogin.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, String>{
	
	User save(User user);
	
}
