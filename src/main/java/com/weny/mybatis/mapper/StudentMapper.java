package com.weny.mybatis.mapper;

import java.util.List;

import com.weny.mybatis.model.Student;

public interface StudentMapper {
	
	Student queryStudentByClassNo(String classNo) throws Exception;
	
	List<Student> queryStudentListLazyLoad();

}
