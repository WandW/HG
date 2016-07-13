package com.dao;

import java.io.IOException;
import java.util.List;

import com.entity.Album;
import com.entity.Sing;
import com.entity.User;

public interface ISingsDAO {
	public void save(Sing transientInstance);
	public void delete(Sing persistentInstance);
	public void delete(java.lang.Integer id);
	public List findAll();
	public void attachDirty(Sing instance);
	public void attachClean(Sing instance);
	public List findByProperty(String propertyName, Object value);
}
