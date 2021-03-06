package com.example.bankingsystem.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@NotNull
	@Column(name="accnumber")
	private int accnumber;

	@NotNull
	@Column(name="type")
	private String type;

	@NotNull
	@Size(min = 4, message = "amount should have at least 4 numbers")
	@Column(name="amount")
	private float amount;
	
	public int getId(){
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccnumber() {
		return accnumber;
	}
	public void setAccnumber(int accnumber) {
		this.accnumber = accnumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Account(int id, int accnumber, String type, float amount) {
		super();
		this.id = id;
		this.accnumber = accnumber;
		this.type = type;
		this.amount = amount;
	}
	public Account() {
		
	}
	
	
	
	
	
}
