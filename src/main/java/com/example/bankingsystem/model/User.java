package com.example.bankingsystem.model;

import java.util.Collection;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="user", uniqueConstraints = @UniqueConstraint(columnNames = "nic"))
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;

	@NotBlank(message = "NIC is mandatory")
	@Column(name="nic" ,nullable=false,unique=true)
	private String nic;



	// user name should not be null and empty
	// user name should have at least 2 characters

	@NotEmpty
	@Size(min = 2, message = "user name should have at least 2 characters")
	@Column(name="name",nullable = false)
	private String name;

	@NotNull
	@Column(name="username")
	private String username;

	// password should not be null or empty
	// password should have at least 8 characters
	@NotEmpty
	@Size(min = 8, message = "password should have at least 8 characters")
	@Column(name="password")
	private String password;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="address")
	private String address;

	@NotNull
	@Email
	@Column(name="email")
	private String email;
	
	@Column(name="phonenumber")
	private String phonenumber;
	
	@OneToMany(targetEntity = Account.class,cascade = CascadeType.ALL)
	@JoinColumn(name ="up_fk",referencedColumnName = "id" )
	private List<Account> accounts;
   
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name = "users_roles",
			joinColumns = @JoinColumn(
		            name = "user_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(
				            name = "role_id", referencedColumnName = "id"))
	
	private Collection<Role> roles;
    public User() {
		
   	}
   public User(Integer id, String nic, String name, String username, String password, Integer age, String address,
			String email, String phonenumber, List<Account> accounts, Collection<Role> roles) {
		super();
		this.id = id;
		this.nic = nic;
		this.name = name;
		this.username = username;
		this.password = password;
		this.age = age;
		this.address = address;
		this.email = email;
		this.phonenumber = phonenumber;
		this.accounts = accounts;
		this.roles = roles;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNic() {
		return nic;
	}



	public void setNic(String nic) {
		this.nic = nic;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhonenumber() {
		return phonenumber;
	}



	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}



	public List<Account> getAccounts() {
		return accounts;
	}



	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public Collection<Role> getRoles() {
		return roles;
	}



	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	
	
	
	
}
