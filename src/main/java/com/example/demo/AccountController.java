package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;;

@RestController
@RequestMapping("/account")
public class AccountController {
	ArrayList<Account> accounts = new ArrayList<>();
	@Autowired
	AccountService accountService;
	
	@GetMapping("/")
	List<Account> getAccounts() {
		return accountService.getAccounts();
	}
	
	@GetMapping("/{id}")
	Optional<Account> getAccount(@PathVariable("id") Integer id){
		return accountService.getAccount(id);
	}
	
	@PostMapping
	String addAccount(@RequestBody Account account) {
		System.out.println(account);
		accountService.save(account);
		return "Account Added";
	}
	
	@PutMapping
	String updateAccount() {
		System.out.println("Accound Updated");
		return "Account Updated";
	}
	
}
