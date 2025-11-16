package com.demo.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	static Set<Employee> lst;
//	static File f;

	static {
		lst = new HashSet<>();
	}

	@Override
	public void readData(String string) {

//		f = string;

		File f = new File("EmpData.txt");
		if (f.exists())
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
				while (true) {
					try {
						Employee e = (Employee) ois.readObject();
						lst.add(e);
					} catch (EOFException e) {
						System.out.println("Reached end of file.");
						break;
					}
				}
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
	}

	@Override
	public boolean save(Employee e) {
		return lst.add(e);
	}

	public Set<Employee> displayAll() {
		return lst;
	}

	@Override
	public boolean writeTo(String fname) {
		File f = new File(fname);
		if (!f.exists())
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
				for (Employee e : lst) {
					oos.writeObject(e);
					oos.close();
				}
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		else
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
				for (Employee e : lst) {
					oos.writeObject(e);
				}
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
	}

	@Override
	public Employee getElementById(int id) {
		// TODO Auto-generated method stub
		for(Employee e : lst) {
			if(e.getEmpId() == id)
				return e;
		}
		return null;
	}

	@Override
	public boolean removeElementById(int id) {
		// TODO Auto-generated method stub
		return lst.remove(new Employee(id));
	}

}
