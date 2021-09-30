package com.example.bankingsystem.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="TotalaccountAmount")
public class AccountAmount {
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


	@Column(name="amount")
	private float amount;

}
