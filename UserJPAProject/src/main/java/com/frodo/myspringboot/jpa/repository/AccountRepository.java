package com.frodo.myspringboot.jpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frodo.myspringboot.jpa.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{
	//Account findByUsername(String username);
	Optional<Account> findByUsername(String username);
}
