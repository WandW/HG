package com.entity;

public class Sing {
	String sing_Name;
	int sing_Id,album_Id;
	public void Sing(int sing_Id,int album_Id,String sing_Name){
		this.sing_Id=sing_Id;
		this.album_Id=album_Id;
		this.sing_Name=sing_Name;

	}
	public String getSing_Name() {
		return sing_Name;
	}
	public void setSing_Name(String sing_Name) {
		this.sing_Name = sing_Name;
	}
	public int getSing_Id() {
		return sing_Id;
	}
	public void setSing_Id(int sing_Id) {
		this.sing_Id = sing_Id;
	}
	public int getAlbum_Id() {
		return album_Id;
	}
	public void setAlbum_Id(int album_Id) {
		this.album_Id = album_Id;
	}
	
}
