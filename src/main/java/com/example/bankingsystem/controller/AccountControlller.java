package com.example.bankingsystem.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.bankingsystem.model.Account;
import com.example.bankingsystem.model.User;
import com.example.bankingsystem.service.Accountservice;
import com.example.bankingsystem.service.Userservice;

@Controller
public class AccountControlller {
	@Autowired
    private Accountservice accservice;
	private Userservice userservice;
	
	@GetMapping("/accounts")
	public List<Account> list(){
		return accservice.getAll();
	}
	@GetMapping("/account/{accid}")
	public ResponseEntity<Account> get(@PathVariable Integer accid){
		try {
			Account acc= accservice.getById(accid);
		    return new ResponseEntity<Account>(acc,HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<Account>(HttpStatus.NOT_FOUND);
		}
	}
//	@PostMapping("/accadd")
//	public void add(@RequestBody Account acc) {
//		try {
//			//User u =userservice.getById(userid);
//			System.out.println( acc);
//			
//			accservice.save(acc);
//		}  catch (NoSuchElementException e) {
//			 System.out.println( "error ####");
//	        
//	    } 
//		 
//	}
	
	
	//add amount
	@PutMapping("/addamount/{accid}")
	public ResponseEntity<Account> update(@RequestBody Account acc, @PathVariable Integer accid) {
	    try {
	        Account existacc = accservice.getById(accid);
	        float accbalance =acc.getAmount();
	        float updateamount = acc.getAmount() + existacc.getAmount();
	        existacc.setAmount(updateamount);
	       
	        accservice.save(existacc);
	        return new ResponseEntity<Account>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Account>(HttpStatus.NOT_FOUND);
	    }      
	}
	//delete acc
	@DeleteMapping("/delacc/{id}")
	public void delete(@PathVariable Integer id) {
		accservice.delete(id);
	}
}