package com.weny.mybatis.model;

import java.util.List;

public class UserQueryVo {
	
	private List<Integer> ids;
	
	private UserCustom userCustom;

	public UserCustom getUserVo() {
		return userCustom;
	}

	public void setUserVo(UserCustom userCustom) {
		this.userCustom = userCustom;
	}

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

}
