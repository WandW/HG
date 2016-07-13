package com.services;

import java.io.IOException;
import java.util.List;

import com.entity.Album;
import com.entity.User;

public interface IAlbumsServices {
	public void add(Album users);
	public void delete(java.lang.Integer id);	
	public List list();	
	public void update(Album users);	
}
