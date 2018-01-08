package com.weny.mybatis.model;

public class Classes {
	private String cNo;

	private String cName;

	private String cSno;

	public String getcNo() {
		return cNo;
	}

	public void setcNo(String cNo) {
		this.cNo = cNo;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcSno() {
		return cSno;
	}

	public void setcSno(String cSno) {
		this.cSno = cSno;
	}

	@Override
	public String toString() {
		return "Classes [cNo=" + cNo + ", cName=" + cName + ", cSno=" + cSno + "]";
	}

}
