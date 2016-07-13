package com.entity;

public class Album {
String album_Name,artist_Name,spec,synopsis,create_Date,icon;
int price,album_Id;
public void Album(int album_Id,String album_Name,String artist_Name,String spec,String synopsis,String create_Date,String icon,int price){
	this.album_Id=album_Id;
	this.album_Name=album_Name;
	this.artist_Name=artist_Name;
	this.create_Date=create_Date;
	this.icon=icon;
	this.price=price;
	this.spec=spec;
	this.synopsis=synopsis;
	
}

public int getAlbum_Id() {
	return album_Id;
}
public void setAlbum_Id(int album_Id) {
	this.album_Id = album_Id;
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
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
}
