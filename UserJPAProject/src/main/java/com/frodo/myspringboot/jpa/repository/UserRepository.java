package com.frodo.myspringboot.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frodo.myspringboot.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByName(String name);
}
