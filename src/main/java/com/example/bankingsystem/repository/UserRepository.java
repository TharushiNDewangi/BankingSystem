package com.example.bankingsystem.repository;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.bankingsystem.dto.RequestAcc;
import com.example.bankingsystem.model.Account;
import com.example.bankingsystem.model.User;


@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("SELECT new com.example.bankingsystem.dto.RequestAcc(u.name,a.accnumber) FROM User u Join u.accounts a")
	public List<RequestAcc> getJoinInformation();
	//@Query("SELECT new com.example.usermanagement.dto.RequestAcc(u.name,a.accnumber,SUM(a.amount)) FROM User u Join u.accounts a",)
//	@Query(value = "SELECT SUM(a.amount),u.name FROM Account a,User u where u.id=a.up_fk group by u.name ", nativeQuery = true)
//	public Float getAccAmount();
	//, nativeQuery = true
	@Query(value = "SELECT SUM(a.amount),u.name FROM Account a,User u where u.id=a.up_fk ", nativeQuery = true)
	public Float getAccAmount();
	@Query(value="select * from user u where u.age=?1",nativeQuery = true) 
	public List<User> getuserbyage(Integer age);
	
	@Query(value="select u.id from user u where u.nic=?1",nativeQuery = true)
	public String getByNic(String nic);
	@Query(value="select * from user u where u.id=?1",nativeQuery = true) 
	public List<User> getuseracc(Integer id);
	
	@Query(value="select * from account a where a.type=?1",nativeQuery = true) 
	public List<Account> getaccountbytype(String type);
	
	//@Query(value="select * from account a ,where a.type=?1") 
	//public List<Account> getaccountbytype(String type);
	
	User findByEmail(String email);
	
	
}
