package com.demo.dao;

import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void readData(String string);

	boolean save(Employee e);

	Set<Employee> displayAll();

	boolean writeTo(String string);

	Employee getElementById(int id);

	boolean removeElementById(int id);

}
