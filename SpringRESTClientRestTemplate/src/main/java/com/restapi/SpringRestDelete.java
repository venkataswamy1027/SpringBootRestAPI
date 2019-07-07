package com.restapi;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.restapi.model.Account;

public class SpringRestDelete {
	private static RestTemplate restTemplate = new RestTemplate();
	private static final String baseURL = "http://localhost:7070/";

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		System.out.println("main method started..!");
		/*
		 * Delete Account for given accountId = 3 using Delete method of
		 * RestTemplate
		 */
		restTemplate.delete(baseURL + "account/3");

		List<Account> accounts = restTemplate.getForObject(baseURL + "accounts", List.class);
		System.out.println("Total Accounts after DELETE call: ");
		for (Object acct : accounts) {
			System.out.println(acct);
		}
	}
}
