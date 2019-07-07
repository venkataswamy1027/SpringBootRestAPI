package com.restapi;

import org.springframework.web.client.RestTemplate;

import com.restapi.model.Account;

public class SpringRestUpdate {

	private static RestTemplate restTemplate = new RestTemplate();
	private static final String baseURL = "http://localhost:7070/";

	public static void main(String[] args) {
		System.out.println("main method started..!");
		// Update Account detail for given accountId = 1 using PUT method of
		// RestTemplate
		Account updateAccount = new Account("Anamika Rajput", "Noida", 123.33);
		restTemplate.put(baseURL + "account/1", updateAccount);
		Account updatedAccount = restTemplate.getForObject(baseURL + "account/1", Account.class);
		System.out.println("Updated Account: " + updatedAccount);
	}
}
