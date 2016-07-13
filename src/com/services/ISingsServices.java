package com.services;

import java.io.IOException;
import java.util.List;

import com.entity.Album;
import com.entity.Sing;
import com.entity.User;

public interface ISingsServices {
	public void add(Sing album);
	public void delete(java.lang.Integer id);	
	public List list();	
	public void update(Sing album);	
	public List findByProperty(int album_Id);	
}
