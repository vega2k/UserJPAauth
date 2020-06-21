package com.frodo.myspringboot.mybatis.dao;

import java.util.List;

import com.frodo.myspringboot.mybatis.vo.User;

public interface UserDao {
	public void insert(User user);

	public List<User> readAll();

	public void update(User user);

	public void delete(Long id);

	public User read(Long id);

}
