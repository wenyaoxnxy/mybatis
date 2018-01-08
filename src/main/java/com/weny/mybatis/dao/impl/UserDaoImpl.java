package com.weny.mybatis.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.weny.mybatis.dao.UserDao;
import com.weny.mybatis.model.User;

public class UserDaoImpl implements UserDao {
	
	//通过过早函数注入
	private SqlSessionFactory sqlSessionFactory;
	
	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	

	@Override
	public User findUserById(int id) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		return sqlSession.selectOne("user.selectUserById", id);
	}

	@Override
	public void insertUser(User user) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int cont = sqlSession.insert("user.insertOneUser", user);
		sqlSession.commit();
		System.out.println("insert count : " + cont);
	}

	@Override
	public void deleteUser(int id) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int count = sqlSession.delete("user.deleteUserById",id);
		sqlSession.commit();
		System.out.println("delete counts : "+ count);
	}
	

}
