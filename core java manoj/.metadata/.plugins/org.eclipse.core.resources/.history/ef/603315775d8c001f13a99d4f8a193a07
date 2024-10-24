package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.Exception.EmployeeNotFound;
import com.demo.beans.Employee;
import com.demo.dao.ServiceDao;
import com.demo.dao.ServiceDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	private ServiceDao sdao;
	public EmployeeServiceImpl() {
		sdao = new ServiceDaoImpl();
	}
	@Override
	public void ReadFile(String fname) {
		sdao.ReadFile(fname);
		
	}
	@Override
	public boolean AddNewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		int id=sc.nextInt();
		System.out.println("Enter Employee Name:");
		String name=sc.next();
		System.out.println("Enter Employee Salary:");
		double sal=sc.nextDouble();
		System.out.println("Enter Employee Bonus");
		double bonus=sc.nextDouble();
		Employee e=new Employee(id,name,sal,bonus);
		return sdao.AddNewEmployee(e);
	}
	@Override
	public List<Employee> FindAll() {
		return sdao.GetAll();
	}
	@Override
	public void WriteFile(String fname) {
		sdao.WriteFile(fname);
		
	}
	@Override
	public boolean DeleteEmployee(int id) throws EmployeeNotFound {
		return sdao.RemoveEmployee(id);
	}
	@Override
	public boolean UpdateEmployee(int id, double salary) throws EmployeeNotFound {
		return sdao.UpdateEmployee(id,salary);
	}
}
