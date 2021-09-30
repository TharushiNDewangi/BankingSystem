package com.example.bankingsystem.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class RequestAccDto {
	private String name;
	private int accnum;
	private float amount;
    public RequestAccDto() {
		
	}
	public RequestAccDto(String name, int accnum) {
		
		this.name = name;
		this.accnum = accnum;
	}
	
	
	public RequestAccDto(String name, int accnum, float amount) {
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
