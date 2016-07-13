package com.services;

import java.io.IOException;
import java.util.List;

import com.entity.Album;
import com.entity.User;

public interface IUsersServices {
	public void add(User album);
	public void delete(java.lang.Integer id);	
	public List list();	
	public void update(User album);	
}
