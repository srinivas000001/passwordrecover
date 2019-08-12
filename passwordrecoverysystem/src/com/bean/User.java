package com.bean;

public class User 
{
private int id;
private String  customerName,userName,password,email;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

/*
 * create  table in H2
 * 
 * 
 * Create table register
 * (id int auto_increment,
 * userName varchar(20),
 * password varchar(20),
 * customerName varchar(30),
 * email varchar(50));
 * 
 */

}
