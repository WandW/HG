package com.web.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import com.dao.IUsersDAO;
import com.dao.UsersDAOImpl;
import com.entity.Sing;
import com.entity.User;
import com.services.ISingsServices;
import com.services.IUsersServices;

import java.io.PrintWriter;
public class SingsAction{
	//private IUsersDAO IUsersDao;
	private ISingsServices ISingsServices;
	private Sing sings;
	String sing_Name[],album_Id[];
	private String outMessage;//输出信息	
	private HttpServletRequest request= ServletActionContext.getRequest();//定义request对象
	private HttpServletResponse response= ServletActionContext.getResponse();//定义response对象	
	//登录
	private PrintWriter out;


	public ISingsServices getISingsServices() {
		return ISingsServices;
	}

	public void setISingsServices(ISingsServices iSingsServices) {
		ISingsServices = iSingsServices;
	}

	/**
	 * 用户列表
	 * @return
	 * @throws IOException
	 */
	public String dolist(){	
		//request.setAttribute("list", IUsersDao.findAll());
		request.setAttribute("list", ISingsServices.list());
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
		ISingsServices.delete(Integer.parseInt(request.getParameter("sings_Id")));
		
	}
	/**
	 * 新增用户
	 * @return
	 * @throws IOException 
	 * @throws IOException
	 */
	public String singsadd() throws IOException{	
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
//		//IUsersDao.save(users);
		for(int i = 0 ; i < album_Id.length;i++){
			sings = new Sing();
			sings.setAlbum_Id(Integer.parseInt(album_Id[i]));
			sings.setSing_Name(sing_Name[i]);
			ISingsServices.add(sings);
		}
		out.println("成功"+album_Id.length);
//		out.println("<script language='javascript'>"+"alert('添加成功!');window.location.href='./list.action';"+"</script>");
		return null;
	}
	public String[] getSing_Name() {
		return sing_Name;
	}

	public void setSing_Name(String[] sing_Name) {
		this.sing_Name = sing_Name;
	}


	public String[] getAlbum_Id() {
		return album_Id;
	}

	public void setAlbum_Id(String[] album_Id) {
		this.album_Id = album_Id;
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
		ISingsServices.update(sings);
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

	public ISingsServices getIAlbumsServices() {
		return ISingsServices;
	}

	public void setIAlbumsServices(ISingsServices iAlbumsServices) {
		ISingsServices = iAlbumsServices;
	}

	public Sing getAlbums() {
		return sings;
	}

	public void setAlbums(Sing albums) {
		albums = albums;
	}

	public String getOutMessage() {
		return outMessage;
	}

	public void setOutMessage(String outMessage) {
		this.outMessage = outMessage;
	}
	

}