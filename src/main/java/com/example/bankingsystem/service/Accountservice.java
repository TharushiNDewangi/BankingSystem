package com.example.bankingsystem.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bankingsystem.dto.UserRegistrationDto;
import com.example.bankingsystem.model.Account;
import com.example.bankingsystem.model.Role;
import com.example.bankingsystem.model.User;
import com.example.bankingsystem.repository.AccountRepository;
import com.example.bankingsystem.repository.UserRepository;

@Service
public class Accountservice {
	@Autowired
	private AccountRepository accountrepo;
	
	public List<Account> getAll() {
		return accountrepo.findAll();
	}

	public Account getById(Integer id) {
		return accountrepo.findById(id).get();
	}
	
	public void save( Account acc) {
		accountrepo.save(acc);
    }
	
	 public void delete(Integer id) {
		 accountrepo.deleteById(id);
	    }
	 public User Updateuser(User user,Integer id) {
		 //check user
	        return null;
	    }
//	 public List< Account> getuserbyage(Integer age) {
//		    System.out.println("age"+age);
//			return accountrepo.getuserbyage(age);
//		}
//		public  Account save(UserRegistrationDto registrationDto) {
//			User user = new User(registrationDto.getId(), 
//					registrationDto.getNic(),registrationDto.getName(),registrationDto.getUsername(),registrationDto.getPassword(),
//					registrationDto.getAge(),registrationDto.getAddress(),registrationDto.getPhonenumber(), 
//					registrationDto.getEmail(),
//					registrationDto.getAccounts(), Arrays.asList(new Role("ROLE_USER")));
//			
//			return accountrepo.save(user);
//		}
//		 public List<Account> getaccbytype(String type) {
//			    System.out.println("age"+type);
//				return userrepo.getaccountbytype(type);
//			}
		
}
