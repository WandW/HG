package com.services;

import java.io.IOException;
import java.util.List;

import com.entity.Album;
import com.entity.Order;
import com.entity.User;

public interface IOrdersServices {
	public void add(Order album);
	public void delete(java.lang.Integer id);	
	public List list();	
	public void update(Order album);	
}
