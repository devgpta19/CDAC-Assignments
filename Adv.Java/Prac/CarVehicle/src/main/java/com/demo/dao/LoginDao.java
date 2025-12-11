package com.demo.dao;

import com.demo.beans.MyUSer;

public interface LoginDao {

	MyUSer verifyUser(String uname, String pass);

}
