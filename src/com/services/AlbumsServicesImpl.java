package com.services;

import java.io.IOException;
import java.util.List;

import com.dao.IAlbumsDAO;
import com.dao.IUsersDAO;
import com.entity.Album;
import com.entity.User;

public class AlbumsServicesImpl implements IAlbumsServices {
	private IAlbumsDAO IAlbumsDao;
	
	public void setIAlbumsDao(IAlbumsDAO iAlbumsDao) {
		IAlbumsDao = iAlbumsDao;
	}

	public void update(Album album) {
		// TODO Auto-generated method stub
		IAlbumsDao.attachDirty(album);
	}

	public void delete(java.lang.Integer id) {
		// TODO Auto-generated method stub
		IAlbumsDao.delete(id);
	}
	/**
	 * 通过id查看一条数据
	 */

	public List list() {
		// TODO Auto-generated method stub
		return IAlbumsDao.findAll();
	}


	public void add(Album album) {
		// TODO Auto-generated method stub
		IAlbumsDao.save(album);
	}	
	

}
