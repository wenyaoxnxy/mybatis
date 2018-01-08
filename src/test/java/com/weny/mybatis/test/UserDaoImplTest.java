package com.weny.mybatis.test;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.weny.mybatis.dao.UserDao;
import com.weny.mybatis.dao.impl.UserDaoImpl;

public class UserDaoImplTest {

	private SqlSessionFactory sqlSessionFactory;
	
	@Before
	public void before() throws IOException {
		if(sqlSessionFactory == null) {
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
		}
	}
	
	@Test
	public void testUserDaoFindUserById() throws Exception {
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		userDao.findUserById(1234);
	}

}
