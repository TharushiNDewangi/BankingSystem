package com.example.bankingsystem.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankingsystem.dto.CreateAccount;
import com.example.bankingsystem.dto.RequestAcc;
import com.example.bankingsystem.model.User;
import com.example.bankingsystem.repository.AccountRepository;
import com.example.bankingsystem.repository.UserRepository;
@RestController
public class CreateAccController {
	@Autowired
	private UserRepository userrepository;
	@Autowired
	private AccountRepository accountrepository;
	@PostMapping("/createaccounts")
	public User createAccount(@RequestBody CreateAccount createaccount)
	{
		System.out.println("gg");
		System.out.println(createaccount.getUser());
		return userrepository.save(createaccount.getUser());
	}
	@GetMapping("/findAllaccounts")
    public List<User> findAllaccounts(){
        return userrepository.findAll();
    }
	@GetMapping("/getaccinfor")
    public List<RequestAcc> getJoinInformation(){
        return userrepository.getJoinInformation();
    }
	
	@GetMapping("/getAccAmount")
	public Float getAccAmount() {
	    return userrepository.getAccAmount();
	}
	

    
	
}
