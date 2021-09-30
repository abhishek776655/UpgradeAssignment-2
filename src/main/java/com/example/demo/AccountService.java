package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	@Autowired
	AccountRepository repository;
	
	public void save(Account account) {
		repository.save(account);
	}
	
	public List<Account> getAccounts() {
		return repository.findAll();
	}
	
	public Optional<Account> getAccount(Integer id) {
		return repository.findById(id);
	}

}
