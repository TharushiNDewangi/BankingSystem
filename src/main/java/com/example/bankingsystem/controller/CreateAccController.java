package com.example.bankingsystem.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankingsystem.dto.CreateAccountDto;
import com.example.bankingsystem.dto.RequestAccDto;
import com.example.bankingsystem.model.Account;
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
	public User createAccount(@RequestBody CreateAccountDto createaccount)
	{
		return userrepository.save(createaccount.getUser());
	}
	@GetMapping("/findAllaccounts")
    public List<User> findAllaccounts(){
        return userrepository.findAll();
    }
	@GetMapping("/getaccinfor")
    public List<RequestAccDto> getJoinInformation(){
        return userrepository.getJoinInformation();
    }
	
	@GetMapping("/getAccAmount")
	public Float getAccAmount() {
	    return userrepository.getAccAmount();
	}
	@GetMapping("/getaccbytype/{type}")
    public List<Account> getAccinformation(@PathVariable String type){
        return userrepository.getaccountbytype(type);
    }
	
	

    
	
}
