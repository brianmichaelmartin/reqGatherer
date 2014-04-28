package com.multivision.req.dao.impl;

import java.util.List;

import com.multivision.req.dao.interfaces.LoginDao;
import com.multivision.req.pojos.User;

/**
 * 
 * @author brian_000
 *
 */
public class LoginDaoImpl extends BaseDaoImpl implements LoginDao {
	@Override
	public boolean validate(User user) {
		String stmt = "SELECT username FROM users WHERE username='" + user.getUsername() + "' AND password='" + user.getPassword() + "'";
		List<Object> users = nativeSql(stmt);
		if(users.isEmpty()){
			logger.info("Login attempt failed, Invalid Credentials");
			return false;
		}else{
			logger.info("Login attempt success user: " + user.getUsername());
			return true;
		}
	}
}
