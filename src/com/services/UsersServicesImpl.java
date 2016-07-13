package com.services;

import java.io.IOException;
import java.util.List;

import com.dao.IUsersDAO;
import com.entity.User;

public class UsersServicesImpl implements IUsersServices {
	private IUsersDAO IUsersDao;

	public void update(User users) {
		// TODO Auto-generated method stub
		IUsersDao.attachDirty(users);
	}

	public void delete(java.lang.Integer id) {
		// TODO Auto-generated method stub
		IUsersDao.delete(id);
	}
	/**
	 * 通过id查看一条数据
	 */

	public List list() {
		// TODO Auto-generated method stub
		return IUsersDao.findAll();
	}


	public IUsersDAO getIUsersDao() {
		return IUsersDao;
	}

	public void setIUsersDao(IUsersDAO iUsersDao) {
		IUsersDao = iUsersDao;
	}

	public void add(User users) {
		// TODO Auto-generated method stub
		IUsersDao.save(users);
	}	
	

}
