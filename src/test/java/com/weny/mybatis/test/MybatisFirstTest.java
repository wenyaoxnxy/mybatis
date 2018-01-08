package com.weny.mybatis.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.weny.mybatis.model.User;

public class MybatisFirstTest {
	SqlSessionFactory sqlSessionFactory = null;
	SqlSession sqlSession = null;

	@Before
	public void init() throws IOException {
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
		sqlSession = sqlSessionFactory.openSession();
	}

	@Test
	public void insertUser() {
		User user = new User();
		user.setId(12345);
		user.setAge(15);
		user.setName("王五");
		user.setAddress("湖南衡阳");
		int cont = sqlSession.insert("user.insertOneUser", user);
		sqlSession.commit();
		// 主键策略
		System.out.println("insert count : " + cont);
	}

	@Test
	public void findUserById() {
		User user = sqlSession.selectOne("user.selectUserById", 1234);
		System.out.println("user----" + user);
	}

	@Test
	public void findUserByName() {
		List<User> userList = sqlSession.selectList("user.selectUserByName", "zhang");
		System.out.println("--------userList.size--------" + userList.size());
	}

	@Test
	public void updateUserById() {
		User user = new User();
		user.setId(1234);
		user.setAddress("湖南长沙雨花");
		int count = sqlSession.update("user.updateUserById", user);
		sqlSession.commit();
		System.out.println("update counts : " + count);
	}

	@Test
	public void deleteUserById() {
		int count = sqlSession.delete("user.deleteUserById",12345);
		sqlSession.commit();
		System.out.println("delete counts : "+ count);
	}

	@After
	public void destroy() {
		sqlSession.close();
	}
}
