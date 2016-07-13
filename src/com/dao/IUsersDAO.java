package com.dao;

import java.io.IOException;
import java.util.List;
import com.entity.User;

public interface IUsersDAO {
	public void save(User transientInstance);
	public void delete(User persistentInstance);
	public void delete(java.lang.Integer id);
	public List findAll();
	public void attachDirty(User instance);
	public void attachClean(User instance);
	public List findByProperty(String propertyName, Object value) ;
}
