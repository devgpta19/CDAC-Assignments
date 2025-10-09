package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	void displayAll();

	Employee searchById(int id);

	void displayEmp(Employee e);

	boolean deleteById(int id);

	List<Employee> searchByName(String name);

	List<Employee> searchBySalary(double sal);

	boolean updateSalary(int id, double sal);

	boolean deleteAllBySalary(double sal);

	List<Employee> sortBySalary();

	List<Employee> sortById();

	List<Employee> sortByName();

}
