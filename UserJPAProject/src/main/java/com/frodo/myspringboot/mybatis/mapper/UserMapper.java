package com.frodo.myspringboot.mybatis.mapper;

import java.util.List;

import com.frodo.myspringboot.mybatis.vo.User;

public interface UserMapper {
	User selectUserById(Long id);
	List<User> selectUserList();
	void insertUser(User user);
	void updateUser(User user);
	void deleteUser(Long id);
}

