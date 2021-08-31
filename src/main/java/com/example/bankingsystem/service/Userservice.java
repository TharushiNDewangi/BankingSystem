package com.example.bankingsystem.service;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bankingsystem.dto.RequestAcc;
import com.example.bankingsystem.dto.UserRegistrationDto;
import com.example.bankingsystem.model.Account;
import com.example.bankingsystem.model.Role;
import com.example.bankingsystem.model.User;
import com.example.bankingsystem.repository.UserRepository;



@Service
public class Userservice {
	@Autowired
	private UserRepository userrepo;
	
	public List<User> getAll() {
		return userrepo.findAll();
	}

	public User getById(Integer id) {
		return userrepo.findById(id).get();
	}
	
	public void save(User user) {
        userrepo.save(user);
    }
	
	 public void delete(Integer id) {
	        userrepo.deleteById(id);
	    }
	 public User Updateuser(User user,Integer id) {
		 //check user
	        return null;
	    }
	 public List<User> getuserbyage(Integer age) {
		    System.out.println("age"+age);
			return userrepo.getuserbyage(age);
		}
		public User save(UserRegistrationDto registrationDto) {
			User user = new User(registrationDto.getId(), 
					registrationDto.getNic(),registrationDto.getName(),registrationDto.getUsername(),registrationDto.getPassword(),
					registrationDto.getAge(),registrationDto.getAddress(),registrationDto.getPhonenumber(), 
					registrationDto.getEmail(),
					registrationDto.getAccounts(), Arrays.asList(new Role("ROLE_USER")));
			
			return userrepo.save(user);
		}
		 public List<Account> getaccbytype(Integer id) {
			    System.out.println("age"+id);
				return userrepo.getaccountbytype(id);
			}
		
}
