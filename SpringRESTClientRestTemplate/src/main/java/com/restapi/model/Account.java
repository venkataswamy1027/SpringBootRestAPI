package com.restapi.model;
import java.io.Serializable;

public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public Long id;

	public String name;

	public String city;

	public Double balance;
	
	public Account() {
		super();
	}
	
	public Account(String name, String city, Double balance) {
		super();
		this.name = name;
		this.city = city;
		this.balance = balance;
	}

	public Long Id() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", city=" + city + ", balance=" + balance + "]";
	}

}
