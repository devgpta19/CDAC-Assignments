package com.demo.services;

import java.sql.SQLException;

import com.demo.beans.Users;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {
	private LoginDao ldao;
	
	public LoginServiceImpl() {
		ldao = new LoginDaoImpl();
	}

	@Override
	public Users validateUser(String unm, String pass) throws SQLException {
		
		return ldao.checkUser(unm, pass);
	}
	
	
}
