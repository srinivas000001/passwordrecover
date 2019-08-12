package com.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.bean.User;

public class UserDao 
{
public static Connection getConnection()
{
	Connection con=null;
	try{
		Class.forName("org.h2.Driver");
		con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","sa");
	}catch(Exception e){System.out.println(e);}
	return con;
}
public static int save(User u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("insert into register(userName,password,customername,email) values(?,?,?,?)");
		ps.setString(1,u.getUserName());
		ps.setString(2,u.getPassword());
		ps.setString(3,u.getCustomerName());
		ps.setString(4,u.getEmail());
		
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}
	return status;
}

public static User checkUser(String uname, String pwd){
	User u=null;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from register where username=? and password=?");
		ps.setString(1,u.getUserName());
		ps.setString(2, u.getPassword());
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
		     return u;
		}
	}catch(Exception e){System.out.println(e);}
	return u;
}
}
