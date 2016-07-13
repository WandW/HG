package com.dao;

import java.io.IOException;
import java.util.List;

import com.entity.Order;
import com.entity.User;

public interface IOrdersDAO {
	public void save(Order transientInstance);
	public void delete(Order persistentInstance);
	public void delete(java.lang.Integer id);
	public List findAll();
	public void attachDirty(Order instance);
	public void attachClean(Order instance);
	public List findByProperty(String propertyName, Object value);
}
