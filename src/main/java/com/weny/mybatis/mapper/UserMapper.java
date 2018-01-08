package com.weny.mybatis.mapper;

import java.util.List;

import com.weny.mybatis.model.User;
import com.weny.mybatis.model.UserCustom;
import com.weny.mybatis.model.UserQueryVo;

public interface UserMapper {

	public void insertOneUser(User user) throws Exception;
	
	public User selectUserById(int id) throws Exception;
	
	public User selectUserByName(String name) throws Exception;
	
	public void updateUserById(User user) throws Exception;
	
	public void  deleteUserById(int id) throws Exception;
	
	public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;
	
	public List<User> findUserListResultMap(UserQueryVo userQueryVo) throws Exception;
	
	public List<UserCustom> findUserListBydynamicSql(UserQueryVo userQueryVo) throws Exception;
	
	public List<UserCustom> findUserListBySqlSnippet(UserQueryVo userQueryVo) throws Exception;
	
	public List<UserCustom> findUserListBySqlForeatch(UserQueryVo userQueryVo) throws Exception;
}
