package com.frodo.myspringboot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.frodo.myspringboot.service.AccountService;

@Component
public class AccountRunner implements ApplicationRunner {
	@Autowired
	private AccountService service;
	
	@Value("${myusername}")
	String username;
	
	@Value("${mypassword}")
	String password;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		service.createAccount(username, password);
		
	}
	
}
