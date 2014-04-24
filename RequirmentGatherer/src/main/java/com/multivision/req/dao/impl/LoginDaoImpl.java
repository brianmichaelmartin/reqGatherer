package com.multivision.req.dao.impl;

import com.multivision.req.dao.interfaces.LoginDao;
import com.multivision.req.pojos.User;

public class LoginDaoImpl extends BaseDaoImpl implements LoginDao {

	public LoginDaoImpl() {
		
	}

	@Override
	public boolean validate(User user) {
		
		return false;
	}

}
