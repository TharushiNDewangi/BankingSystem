package com.example.bankingsystem.dto;

import com.example.bankingsystem.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CreateAccount {
	
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
