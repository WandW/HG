package com.dao;

import java.io.IOException;
import java.util.List;

import com.entity.Album;
import com.entity.User;

public interface IAlbumsDAO {
	public void save(Album transientInstance);
	public void delete(Album persistentInstance);
	public void delete(java.lang.Integer id);
	public List findAll();
	public void attachDirty(Album instance);
	public void attachClean(Album instance);
	public List findByProperty(String propertyName, Object value) ;
}
