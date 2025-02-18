package com.demo.dao;

import java.util.List;

import com.demo.Exception.EmployeeNotFound;
import com.demo.beans.Employee;

public interface ServiceDao {

	void ReadFile(String fname);

	boolean AddNewEmployee(Employee e);

	List<Employee> GetAll();

	void WriteFile(String fname);

	boolean RemoveEmployee(int id) throws EmployeeNotFound;

	boolean UpdateEmployee(int id, double salary) throws EmployeeNotFound;

}
