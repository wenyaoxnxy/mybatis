package com.weny.mybatis.dao;

import com.weny.mybatis.model.User;

public interface UserDao {

	User findUserById(int id) throws Exception;

	void insertUser(User user) throws Exception;

	void deleteUser(int id) throws Exception;
}
