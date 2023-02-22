package com.springboot.naverlogin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user_login")
public class User {
	@Id
	@Column(name = "user_id")
	private String id;
	
	@Column(name = "user_name")
	private String name;
	
	@Column(name = "user_password")
	private String password;
	
	@Column(name = "user_email")
	private String email;

}
