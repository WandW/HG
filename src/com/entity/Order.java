package com.entity;

public class Order {
int order_Id,user_Id,state;
String time;

public void Order(int order_Id,int user_Id,int state,String time){
	this.order_Id=order_Id;
	this.user_Id=user_Id;
	this.state=state;
	this.time=time;
}

public int getOrder_Id() {
	return order_Id;
}

public void setOrder_Id(int order_Id) {
	this.order_Id = order_Id;
}

public int getUser_Id() {
	return user_Id;
}

public void setUser_Id(int user_Id) {
	this.user_Id = user_Id;
}

public int getState() {
	return state;
}

public void setState(int state) {
	this.state = state;
}

public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}
}
