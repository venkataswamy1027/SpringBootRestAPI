package com.restapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.Account;
import com.restapi.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	private AccountService accountService;

	@GetMapping("/")
	public String home() {
		return "Spring REST Demo on Java..!";
	}

	@GetMapping("/accounts")
	public List<Account> all() {
		return accountService.list();
	}

	@GetMapping("/account/{accountId}")
	public Account get(@PathVariable Long accountId) {
		Optional<Account> accounts = accountService.get(accountId);
		return accounts.get();
	}

	@PostMapping("/account")
	public Account create(@RequestBody Account account) {
		return accountService.create(account);
	}

	@PutMapping("/account/{accountId}")
	public Account update(@RequestBody Account account, @PathVariable Long accountId) {
		return accountService.update(account, accountId);
	}

	@DeleteMapping("/account/{accountId}")
	public void delete(@PathVariable Long accountId) {
		accountService.delete(accountId);
	}
}
