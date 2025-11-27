package com.demo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.demo.beans.Users;

public class UserDaoImpl implements UserDao {
	
	PreparedStatement pst;
	Connection conn = DBUtil.getMyConnection();
	@Override
	public int addUser(Users u, String pass) {
		try {
			pst = conn.prepareStatement("insert into user value(null, ?, ?, ?, ?, ?, ?)");
			pst.setString(1, u.getUname());
			pst.setBytes(2, pass.getBytes());
			pst.setString(3, u.getEmail());
			pst.setString(4, u.getRole());
			Date sdt = java.sql.Date.valueOf(u.getDob());
			pst.setDate(5, sdt);
			pst.setString(6, u.getGender());
			
			int n = pst.executeUpdate();
			return n;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
