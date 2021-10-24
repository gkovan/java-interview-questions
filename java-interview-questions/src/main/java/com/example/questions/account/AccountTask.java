package com.example.questions.account;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class AccountTask {
	
	private static Map<String,AccountModel> accounts = new HashMap<String,AccountModel>();
	
	static {
		AccountModel account111 = new AccountModel("111", "account 111");
		accounts.put(account111.getId(), account111);
		AccountModel account222 = new AccountModel("222", "account 222");
		accounts.put(account222.getId(), account222);
	}
	
	public AccountModel getAccount(String id) {
		if (accounts.containsKey(id)) {
			return accounts.get(id);
		} else {
			return null;
		}
	}

}
