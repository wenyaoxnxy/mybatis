package com.weny.mybatis.model;

import java.util.List;

public class Student {
	
	private int id;
	
	private String sNo;

	private String sName;

	private Classes classes;

	private List<Course> course;

	public String getsNo() {
		return sNo;
	}

	public void setsNo(String sNo) {
		this.sNo = sNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sNo=" + sNo + ", sName=" + sName + ", classes=" + classes + ", course=" + course
				+ "]";
	}

}
