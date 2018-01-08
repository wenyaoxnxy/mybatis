package com.weny.mybatis.test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.weny.mybatis.mapper.UserMapper;
import com.weny.mybatis.model.User;
import com.weny.mybatis.model.UserCustom;
import com.weny.mybatis.model.UserQueryVo;

public class UserMapperTest {

	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void befor() throws IOException {
		if (sqlSessionFactory == null) {
			this.sqlSessionFactory = new SqlSessionFactoryBuilder()
					.build(Resources.getResourceAsStream("SqlMapConfig.xml"));
		}
	}

	// @Test
	public void insertOneUserTest() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		userMapper.insertOneUser(new User(123456, "test", 16, "雨花区"));
		sqlSession.commit();
		sqlSession.close();
	}

	@Test
	public void selectUserByIdTest() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = userMapper.selectUserById(123456);
		System.out.println(user);
	}

	@Test
	public void findUserListTest() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		userCustom.setAddress("长沙");
		userCustom.setAge(12);
		userQueryVo.setUserVo(userCustom);
		List<UserCustom> users = userMapper.findUserList(userQueryVo);
		System.out.println(users);
	}

	@Test
	public void findUserListResultMapTest() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		userCustom.setAddress("长沙");
		userCustom.setAge(12);
		userQueryVo.setUserVo(userCustom);
		List<User> list = userMapper.findUserListResultMap(userQueryVo);
		System.out.println(list);
	}

	@Test
	public void findUserListBydynamicSqlTest() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		// userCustom.setAddress("长沙");
		userCustom.setAge(12);
		userQueryVo.setUserVo(userCustom);
		List<UserCustom> users = userMapper.findUserListBydynamicSql(userQueryVo);
		System.out.println("---------findUserListBydynamicSql------------");
		System.out.println(users);
	}

	@Test
	public void findUserListBySqlSnippetTest() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		userCustom.setAddress("长沙");
		userCustom.setAge(12);
		userQueryVo.setUserVo(userCustom);
		List<UserCustom> users = userMapper.findUserListBySqlSnippet(userQueryVo);
		System.out.println("---------findUserListBySqlSnippet------------");
		System.out.println(users);
	}

	@Test
	public void findUserListBySqlForeatchTest() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		userCustom.setAddress("长沙");
		userQueryVo.setUserVo(userCustom);
		List<Integer> ids = Arrays.asList(123, 1234, 12345);
		userQueryVo.setIds(ids);
		List<UserCustom> users = userMapper.findUserListBySqlForeatch(userQueryVo);
		System.out.println("---------findUserListBySqlForeatch------------");
		System.out.println(users);
	}

}
