package com.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.db.DB;
import com.model.User;

public class UserServiceImpl implements UserService {

	@Override
	public void signUpUser(User user) {
		
		String sql = "insert into user(firstname,lastname,username,password) values('"+user.getFname()+"','"+user.getLname()+"','"+user.getUsername()+"','"+user.getPassword()+"')";
		
		try {
			Statement stm = DB.getDbConnection().createStatement();
			stm.execute(sql);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean loginUser(String un, String psw) {
		
		String sql = "select * from user where username = '"+un+"' and password='"+psw+"'";
		try {
			Statement stm = DB.getDbConnection().createStatement();
			
			ResultSet rs = stm.executeQuery(sql);
			if(rs.next()) {
				return true;
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	
}
