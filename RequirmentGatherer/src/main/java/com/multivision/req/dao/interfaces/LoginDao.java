package com.multivision.req.dao.interfaces;

import com.multivision.req.pojos.User;

public interface LoginDao {
	/**
	 * 
	 * @param user user object to validate
	 * @return true if valid credentials, false if not
	 */
	public boolean validate(User user);
}
