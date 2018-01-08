package com.weny.mybatis.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.weny.mybatis.mapper.StudentMapper;
import com.weny.mybatis.model.Classes;
import com.weny.mybatis.model.Student;

public class StudentMapperTest {
	
	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void init() throws IOException {
		if(sqlSessionFactory ==null) {
			this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream( "SqlMapConfig.xml"));
		}
	}
	
	@Test
	public void queryStudentByClassNoTest() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		try {
			Student student = studentMapper.queryStudentByClassNo("class1");
			System.out.println(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void queryStudentListLazyLoadTest() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		List<Student> students = studentMapper.queryStudentListLazyLoad();
		for (Student student : students) {
			Classes s = student.getClasses();
			System.out.println(s);
		}
	}
}
