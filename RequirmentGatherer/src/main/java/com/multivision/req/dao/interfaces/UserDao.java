package com.multivision.req.dao.interfaces;

import java.util.List;

import com.multivision.req.dao.impl.FilterCondition;
import com.multivision.req.pojos.User;

public interface UserDao {
	/**
	 * saveUser(User user) used to persist a User object
	 * 
	 * @param user User to be persisted
	 * @return username of the User
	 */
	public String saveUser(User user);
	/**
	 * updateUser(User user) used to updated a User object in the database
	 * 
	 * @param user User to be updated
	 * @return username of the User
	 */
	public String updateUser(User user);
	/**
	 * deleteUser(User user) used to delete a User object from the database
	 * @param user User to be deleted
	 * @return true: if user deleted successfully, false: if user delete failed
	 */
	public boolean deleteUser(User user);
	/**
	 * 
	 * @return all of the User objects in the database
	 */
	public List<User> getUsers();
	/**
	 * 
	 * @param filters the filters for the search
	 * @return the searched for Users in the database
	 */
	public List<User> searchUsers(List<FilterCondition> filters);
}
