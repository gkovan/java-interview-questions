package com.example.questions.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	
	private AccountTask accountTask;
	
	@Autowired
	public AccountController(AccountTask accountTask) {
		this.accountTask = accountTask;
	}
	
	@GetMapping("/api/account/{id}")
	public AccountModel account(@PathVariable String id) {
		return accountTask.getAccount(id);		
	}

}
