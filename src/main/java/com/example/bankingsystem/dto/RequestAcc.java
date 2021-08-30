package com.example.bankingsystem.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class RequestAcc {
	private String name;
	private int accnum;
	private float amount;
    public RequestAcc() {
		
	}
	public RequestAcc(String name, int accnum) {
		
		this.name = name;
		this.accnum = accnum;
	}
	
	
	public RequestAcc(String name, int accnum, float amount) {
		super();
		this.name = name;
		this.accnum = accnum;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccnum() {
		return accnum;
	}
	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}
	

}
