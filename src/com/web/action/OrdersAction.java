package com.web.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import com.dao.IUsersDAO;
import com.dao.UsersDAOImpl;
import com.entity.Order;
import com.entity.Sing;
import com.entity.User;
import com.services.IOrdersServices;
import com.services.IUsersServices;

import java.io.PrintWriter;
public class OrdersAction{
	//private IUsersDAO IUsersDao;
	private IOrdersServices IOrdersServices;
	private Order orders;
	private String outMessage;//输出信息	
	private HttpServletRequest request= ServletActionContext.getRequest();//定义request对象
	private HttpServletResponse response= ServletActionContext.getResponse();//定义response对象	
	//登录
	private PrintWriter out;


	/**
	 * 用户列表
	 * @return
	 * @throws IOException
	 */
	public String dolist(){	
		//request.setAttribute("list", IUsersDao.findAll());
		request.setAttribute("list", IOrdersServices.list());
		return "albumlist";
	}
	/**
	 * 查看一条数据
	 * @return  
	 * @throws IOException
	 */

	/**
	 * 删除用户
	 * @return
	 * @throws IOException
	 */
	public void dodelete(){	
		//request.setAttribute("list", IUsersDao.findAll());
		IOrdersServices.delete(Integer.parseInt(request.getParameter("orders_Id")));
		
	}
	/**
	 * 新增用户
	 * @return
	 * @throws IOException 
	 * @throws IOException
	 */
	public String doadd() throws IOException{	
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//IUsersDao.save(users);
		IOrdersServices.add(orders);
		out.println("<script language='javascript'>"+"alert('添加成功!');window.location.href='./list.action';"+"</script>");
		return null;
	}
	/**
	 * 修改用户
	 * @return
	 * @throws IOException 
	 * @throws IOException
	 */
	public String doupdate() throws IOException{	
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//IUsersDao.save(users);
		IOrdersServices.update(orders);
		out.println("<script language='javascript'>"+"alert('修改成功!');window.location.href='./list.action';"+"</script>");
		return null;
	}
	/*
	public IUsersDAO getIUsersDao() {
		return IUsersDao;
	}
	public void setIUsersDao(IUsersDAO iUsersDao) {
		IUsersDao = iUsersDao;
	}
	*/

	public IOrdersServices getIAlbumsServices() {
		return IOrdersServices;
	}

	public void setIAlbumsServices(IOrdersServices iAlbumsServices) {
		IOrdersServices = iAlbumsServices;
	}


	public IOrdersServices getIOrdersServices() {
		return IOrdersServices;
	}

	public void setIOrdersServices(IOrdersServices iOrdersServices) {
		IOrdersServices = iOrdersServices;
	}

	public Order getOrders() {
		return orders;
	}

	public void setOrders(Order orders) {
		this.orders = orders;
	}

	public String getOutMessage() {
		return outMessage;
	}

	public void setOutMessage(String outMessage) {
		this.outMessage = outMessage;
	}
	

}