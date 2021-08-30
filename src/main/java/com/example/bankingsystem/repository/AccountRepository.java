package com.example.bankingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bankingsystem.model.Account;


public interface AccountRepository extends JpaRepository<Account, Integer>{

}
