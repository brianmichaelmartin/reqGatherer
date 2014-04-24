package com.multivision.req.dao.interfaces;

import java.util.List;

import com.multivision.req.dao.impl.FilterCondition;
import com.multivision.req.pojos.Status;

public interface StatusDao {
	/**
	 * saveStatus(Status status) used to persist a status object
	 * 
	 * @param status Status to be persisted
	 * @return id of Status
	 */
	public int saveStatus(Status status);
	/**
	 * updateStatus(Status status) used to updated a status object in the database
	 * 
	 * @param status Status to be updated
	 * @return id of status
	 */
	public String updateStatus(Status status);
	/**
	 * deleteStatus(Status status) used to delete a status object from the database
	 * @param status Status to be deleted
	 * @return true: if status deleted successfully, false: if status delete failed
	 */
	public boolean deleteStatus(Status status);
	/**
	 * 
	 * @return all of the status objects in the database
	 */
	public List<Status> getStatus();
	/**
	 * 
	 * @param filters the filters for the search
	 * @return the searched for status in the database
	 */
	public List<Status> searchStatus(List<FilterCondition> filters);
}
