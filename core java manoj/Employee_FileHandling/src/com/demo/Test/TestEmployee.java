package com.demo.Test;

import java.util.List;
import java.util.Scanner;

import com.demo.Exception.EmployeeNotFound;
import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService es=new EmployeeServiceImpl();
		es.ReadFile("Try.txt");
		int choice=0;
		do {
			System.out.println("1.Add New Employee \n2.Delete Employee \n3.Update Information "
					+ "\n4.Display All \n5.Exit \nChoice:");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:boolean status=es.AddNewEmployee();
				if(status)
					System.out.println("New Employee Added");
				
				break;
			case 2:System.out.println("Enter Id top Delete:");
				int id=sc.nextInt();
				try {
					status=es.DeleteEmployee(id);
					if(status)
						System.out.println("Employee Delete Successfully");
				} catch (EmployeeNotFound e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage()); 
				}
				
			
				break;
			case 3:System.out.println("Enter Id to Update:");
				 id=sc.nextInt();
				 System.out.println("Enter Salary To update:");
				 double salary=sc.nextDouble();
				 try {
						status=es.UpdateEmployee(id,salary);
						if(status)
							System.out.println("Employee Updated Successfully");
					} catch (EmployeeNotFound e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage()); 
					}
			
				break;
			case 4:
				List<Employee> elst = es.FindAll();
				elst.stream().forEach(System.out::println);
				break;
			case 5:
				es.WriteFile("Try02.csv");
				System.out.println("Thank you for Visiting.......");
				sc.close();
				break;
			}
		}while(choice!=5);

	}

}
