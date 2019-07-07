package com.restapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.model.Account;
import com.restapi.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public List<Account> list() {
		return (List<Account>) accountRepository.findAll();
	}

	public Optional<Account> get(Long accountId) {
		return accountRepository.findById(accountId);
	}

	public Account create(Account account) {
		return accountRepository.save(account);
	}

	public Account update(Account account, Long accountId) {
		account.setId(accountId);
		return accountRepository.save(account);
	}

	public void delete(Long accountId) {
		accountRepository.deleteById(accountId);
	}

}
