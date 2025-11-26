package com.demo.services;

import java.sql.SQLException;

import com.demo.beans.Users;
import com.demo.dao.ForgotPasswordDao;
import com.demo.dao.ForgotPasswordDaoImpl;

public class ForgotPasswordServiceImpl implements ForgotPasswordService {
	private ForgotPasswordDao fdao;
	public ForgotPasswordServiceImpl() {
		fdao = new ForgotPasswordDaoImpl();
	}
	@Override
	public int frogotPass(String user, String email, String newPass) throws SQLException {
		return fdao.changePass(user, email, newPass);
	}
	
}
