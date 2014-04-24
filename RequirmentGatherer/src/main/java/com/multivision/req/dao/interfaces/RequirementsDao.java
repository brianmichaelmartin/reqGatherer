package com.multivision.req.dao.interfaces;

import java.util.List;

import com.multivision.req.dao.impl.FilterCondition;
import com.multivision.req.pojos.Requirements;

public interface RequirementsDao {
	/**
	 * saveRequirments(Requirements requirements) used to persist a status object
	 * 
	 * @param requirments Requirements to be persisted
	 * @return id of Requirements
	 */
	public int saveRequirements(Requirements requirements);
	/**
	 * updateRequirments(Requirements requirements) used to updated a requirements object in the database
	 * 
	 * @param requirements Requirements to be updated
	 * @return id of Requirements
	 */
	public String updateRequirments(Requirements requirements);
	/**
	 * deleteRequirments(Requirements requirements) used to delete a Requirements object from the database
	 * @param requirements Requirements to be deleted
	 * @return true: if requirements deleted successfully, false: if requirements delete failed
	 */
	public boolean deleteRequirements(Requirements requirements);
	/**
	 * 
	 * @return all of the Requirements objects in the database
	 */
	public List<Requirements> getRequirements();
	/**
	 * 
	 * @param filters the filters for the search
	 * @return the searched for Requirements in the database
	 */
	public List<Requirements> searchRequirements(List<FilterCondition> filters);
}
