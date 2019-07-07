package com.restapi;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.restapi.model.Account;

public class SpringRestGetMethod {
	private static RestTemplate restTemplate = new RestTemplate();
	private static final String baseURL = "http://localhost:7070/";

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		System.out.println("main method started..!");
		// Read List of Account details
		List<Account> accounts = restTemplate.getForObject(baseURL + "accounts", List.class);
		System.out.println("Total Accounts before delete call: ");
		for (Object acct : accounts) {
			System.out.println(acct);
		}
		System.out.println("-------------------------------------------");
		// Read Account details for a given accountId
		Account accountDetail = restTemplate.getForObject(baseURL + "account/1", Account.class);
		System.out.println("Account Detail for given AccountId : " + accountDetail);

	}
}
