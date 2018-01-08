package com.weny.mybatis.model;

public class Course {
	private String cuNo;
	private String cuSno;

	public String getCuNo() {
		return cuNo;
	}

	public void setCuNo(String cuNo) {
		this.cuNo = cuNo;
	}

	public String getCuSno() {
		return cuSno;
	}

	public void setCuSno(String cuSno) {
		this.cuSno = cuSno;
	}

	@Override
	public String toString() {
		return "Course [cuNo=" + cuNo + ", cuSno=" + cuSno + "]";
	}

}
