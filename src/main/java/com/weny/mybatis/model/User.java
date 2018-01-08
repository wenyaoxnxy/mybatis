package com.weny.mybatis.model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -2637822719460277506L;
	
	private int id;

	private String name;

	private int age;

	private String address;
	
	public User() {}
	
	public User(int id,String name,int age,String address) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
