package com.demo.dao;

import com.demo.beans.Student;

public interface StudentDao {

	boolean save(Student s);

	Student getStdById(int sid);

}
