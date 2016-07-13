package com.entity;

public class User implements java.io.Serializable {

	// Fields

	private int user_Id;
	private String user_Name;
	private String account;
	private String pwd;
	private String user_Icon;
	

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(int user_Id,String user_Name, String account, String pwd, String user_Icon) {
		this.user_Id = user_Id;
		this.user_Name = user_Name;
		this.account = account;
		this.pwd = pwd;
		this.user_Icon = user_Icon;
	}


	public int getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUser_Icon() {
		return user_Icon;
	}

	public void setUser_Icon(String user_Icon) {
		this.user_Icon = user_Icon;
	}

	// Property accessors


}