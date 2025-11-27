package com.demo.services;

import java.sql.SQLException;

import com.demo.beans.Users;

public interface LoginService {

	Users validateUser(String unm, String pass) throws SQLException;

}
