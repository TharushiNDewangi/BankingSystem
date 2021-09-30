package com.example.bankingsystem.dto;

import com.example.bankingsystem.model.User;
public class CreateAccountDto {
	
	private User user;

	public User getUser() {
		System.out.println("getter");
		return user;
	}

	public void setUser(User user) {
		System.out.println("setter");
		this.user = user;
	}
	

}
