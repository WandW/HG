package com.web.action;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





import org.apache.struts2.ServletActionContext;
import org.aspectj.util.FileUtil;

import com.dao.IUsersDAO;
import com.dao.UsersDAOImpl;
import com.entity.Album;
import com.entity.User;
import com.services.IAlbumsServices;
import com.services.IUsersServices;

import java.io.PrintWriter;
public class AlbumsAction{
	//private IUsersDAO IUsersDao;
	private IAlbumsServices IAlbumsServices;
	 
	String album_Name,artist_Name,create_Date,icon,price,spec,synopsis;
	private File albumicon;
	private String albumiconFileName;
	private String albumiconContentType;
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
		request.setAttribute("list", IAlbumsServices.list());
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
	public void dodelete() throws IOException{	
		//request.setAttribute("list", IUsersDao.findAll());
		response.setCharacterEncoding("GB2312");
		PrintWriter out = response.getWriter();
		IAlbumsServices.delete(Integer.parseInt(request.getParameter("album_Id")));

		out.println("<script language='javascript'>"+"alert('删除成功!');window.location.href='./albumlist.action';"+"</script>");
	}
	/**
	 * 新增用户
	 * @return 
	 * @return
	 * @throws IOException 
	 * @throws IOException
	 */
	public  void doadd() throws IOException{	
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
//		//IUsersDao.save(users);
		String path = ServletActionContext.getServletContext().getRealPath("/icon");
		File file = new File(path);
		if(file.exists()){
			file.mkdir();
		}
		Album albums = new Album();
		out.print(album_Name);
		albums.setAlbum_Name(album_Name);
		albums.setArtist_Name(artist_Name);
		albums.setCreate_Date(create_Date);
		albums.setIcon(albumiconFileName);
		albums.setPrice(Integer.parseInt(price));
		albums.setSpec(spec);
		albums.setSynopsis(synopsis);
		out.print(albumiconFileName);	
		out.print(albums.getCreate_Date());
		FileUtil.copyFile(albumicon, new File(file,albumiconFileName));
		IAlbumsServices.add(albums);
		
	out.println("<script language='javascript'>"+"alert('添加成功!');window.location.href='./albumlist.action';"+"</script>");
//		out.print(albums.getAlbum_Name());
		
		
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
		Album albums = new Album();
		albums.setAlbum_Name(album_Name);
		albums.setArtist_Name(artist_Name);
		albums.setCreate_Date(create_Date);
		albums.setIcon(albumiconFileName);
		albums.setPrice(Integer.parseInt(price));
		albums.setSpec(spec);
		albums.setSynopsis(synopsis);
		IAlbumsServices.update(albums);
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

	public IAlbumsServices getIAlbumsServices() {
		return IAlbumsServices;
	}

	public void setIAlbumsServices(IAlbumsServices iAlbumsServices) {
		IAlbumsServices = iAlbumsServices;
	}



	public File getAlbumicon() {
		return albumicon;
	}

	public void setAlbumicon(File albumicon) {
		this.albumicon = albumicon;
	}

	public String getAlbumiconFileName() {
		return albumiconFileName;
	}

	public void setAlbumiconFileName(String albumiconFileName) {
		this.albumiconFileName = albumiconFileName;
	}

	public String getAlbumiconContentType() {
		return albumiconContentType;
	}

	public void setAlbumiconContentType(String albumiconContentType) {
		this.albumiconContentType = albumiconContentType;
	}

	public String getOutMessage() {
		return outMessage;
	}

	public void setOutMessage(String outMessage) {
		this.outMessage = outMessage;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	public PrintWriter getOut() {
		return out;
	}

	public void setOut(PrintWriter out) {
		this.out = out;
	}

	public String getAlbum_Name() {
		return album_Name;
	}

	public void setAlbum_Name(String album_Name) {
		this.album_Name = album_Name;
	}

	public String getArtist_Name() {
		return artist_Name;
	}

	public void setArtist_Name(String artist_Name) {
		this.artist_Name = artist_Name;
	}

	public String getCreate_Date() {
		return create_Date;
	}

	public void setCreate_Date(String create_Date) {
		this.create_Date = create_Date;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}



}