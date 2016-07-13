package com.services;

import java.io.IOException;
import java.util.List;

import com.dao.ISingsDAO;
import com.dao.IUsersDAO;
import com.entity.Album;
import com.entity.Sing;
import com.entity.User;

public class SingsServicesImpl implements ISingsServices {
	private ISingsDAO ISingsDao;
	

	public ISingsDAO getISingsDao() {
		return ISingsDao;
	}

	public void setISingsDao(ISingsDAO iSingsDao) {
		ISingsDao = iSingsDao;
	}

	public void update(Sing sing) {
		// TODO Auto-generated method stub
		ISingsDao.attachDirty(sing);
	}

	public void delete(java.lang.Integer id) {
		// TODO Auto-generated method stub
		ISingsDao.delete(id);
	}
	/**
	 * 通过id查看一条数据
	 */

	public List list() {
		// TODO Auto-generated method stub
		return ISingsDao.findAll();
	}


	public void add(Sing sing) {
		// TODO Auto-generated method stub
		ISingsDao.save(sing);
	}

	public List findByProperty(int album_Id) {
		// TODO Auto-generated method stub
	return	ISingsDao.findByProperty("album_Id", album_Id);
	}	
	

}
