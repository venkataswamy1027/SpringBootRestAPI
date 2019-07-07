package com.restapi;

import org.springframework.web.client.RestTemplate;

import com.restapi.model.Account;

public class SpringRestPostMethod {
	private static RestTemplate restTemplate = new RestTemplate();
	private static final String baseURL = "http://localhost:7070/";

	public static void main(String[] args) {
		System.out.println("main method started..!");
		// Create Account using POST method of RestTemplate
		Account account = new Account("Suresh", "Chennai", 10522.33);
		account = restTemplate.postForObject(baseURL + "account", account, Account.class);
		System.out.println("Added account: " + account);
		System.out.println("-------------------------------------------");
	}
}
