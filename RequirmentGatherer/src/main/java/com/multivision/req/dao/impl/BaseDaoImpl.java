package com.multivision.req.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

import com.multivision.req.exception.HibernateOperationFailedException;

/**
 * 
 * @author Brian Martin
 * Adapted from eHRMS 
 */
public class BaseDaoImpl {
	Logger logger = Logger.getRootLogger();
	private SessionFactory factory = null;
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	/**
	 * 
	 * @param o Object to be persisted
	 * @return ID of newly persisted object
	 */
	protected Object save(Object o){
		Session session = factory.getCurrentSession();
		Object id = null;
		try {
			session.beginTransaction();
			session.save(o);
			id = session.getIdentifier(o);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			logger.error("Error saving object to database, rolling back transaction");
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally{
			try {
				session.close();
			} catch (HibernateException e) {
				e.printStackTrace();
			}
		}
		return id;
	}
	/**
	 * 
	 * @param o object to be updated
	 * @return id of updated persistent object
	 */
	protected Object update(Object o){
		Session session = factory.getCurrentSession();
		Object id = null;
		try {
			session.beginTransaction();
			session.saveOrUpdate(o);
			id = session.getIdentifier(o);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			logger.error("Error updating object in database");
			session.getTransaction().rollback();
			e.printStackTrace();
		}finally{
			try {
				session.close();
			} catch (HibernateException e) {
				e.printStackTrace();
			}
		}
		return id;
	}
	/**
	 * 
	 * @param o object to be deleted
	 * @return 
	 */
	protected void delete(Object o) throws Exception{
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			session.delete(o);
			session.flush();
			session.getTransaction().commit();
		} catch (HibernateException e) {
			logger.error("Error deleting object from database");
			e.printStackTrace();
			session.getTransaction().rollback();
			throw new HibernateOperationFailedException("Failed to delete object from database");
		} finally {
			try {
				session.close();
			} catch (HibernateException e) {
				e.printStackTrace();
				throw new HibernateOperationFailedException("Failed to close session");
			}
		}
	}
	/**
	 * 
	 * @param type object to retrieve all persisted instances of
	 * @return all persisted instances of aforementioned object
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected List retrieveAll(Object type){
		List<Object> objects = null;
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			Criteria criteria = session.createCriteria(type.getClass());
			objects = criteria.list();
			session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			logger.error("Failed to retrieve objects from database");
			e.printStackTrace();
		}finally{
			try {
				session.close();
			} catch (HibernateException e) {
				e.printStackTrace();
			}
		}
		return objects;
	}
	/**
	 * 
	 * @param filters a list of filters to narrow search results
	 * @return all persisted instances that fit applied filters
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected List retrieveByCriteria(Object type, List<FilterCondition> filters){
		List<Object> objects = null;
		Session session = null;
		try {
			if(!filters.isEmpty()){
				session = factory.getCurrentSession();
				Iterator<FilterCondition> itr = filters.iterator();
				FilterCondition filter = null;
				Criteria criteria = session.createCriteria(type.getClass());
				while(itr.hasNext()){
					filter = itr.next();
					criteria.add(setCriteriaBasedOnDataType(filter.getFilterValue(), filter.getFilterField(), filter.getDataType()));
				}
				objects = criteria.list();
				session.getTransaction().commit();
			}
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			logger.error("Failed to retrieve objects from database");
			e.printStackTrace();
		}finally{
			try {
				session.close();
			} catch (HibernateException e) {
				e.printStackTrace();
			}
		}
		return objects;
	}
	/**
	 * TODO: implement
	 * @param type
	 * @param key
	 * @return
	 */
	protected Object retrieveByKey(Object type, String field, String key){
		Object obj = null;
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		
		
		return obj;
	}
	
	/**
	 * helper method for turning a FilterCondition into a SimpleExpression
	 * @param keyValue
	 * @param keyName
	 * @param idType
	 * @return SimpleExpession to be imposed on a Criteria
	 */
	private SimpleExpression setCriteriaBasedOnDataType(String keyValue,
			String keyName, String idType) {
		SimpleExpression simpleExpression = null;
		switch(idType){
			case "long":
				simpleExpression = Restrictions.eq(keyName,Long.valueOf(keyValue.trim()));
				break;
			case "int":
			case "integer":
				simpleExpression = Restrictions.eq(keyName,Integer.valueOf(keyValue.trim()));
				break;
			case "byte":
				simpleExpression = Restrictions.eq(keyName,Byte.valueOf(keyValue.trim()));
				break;
			case "string":
				simpleExpression = Restrictions.eq(keyName, keyValue.trim());
				break;
			case "short":
				simpleExpression = Restrictions.eq(keyName,Short.valueOf(keyValue.trim()));
				break;
			case "float":
				simpleExpression = Restrictions.eq(keyName,Float.valueOf(keyValue.trim()));
				break;
			case "double":
				simpleExpression = Restrictions.eq(keyName,Double.valueOf(keyValue.trim()));
				break;
			case "char":
			case "character":
				simpleExpression = Restrictions.eq(keyName, keyValue);
				break;
			case "boolean":
				simpleExpression = Restrictions.eq(keyName,Boolean.valueOf(keyValue.trim()));
				break;
		}
		return simpleExpression;
	}
}
