package com.demo.test;

import java.util.Scanner;

import com.demo.service.AccountService;
import com.demo.service.AccountServiceImpl;

public class TestAccount {
	public static void main(String[] args) {	
		
		Scanner sc=new Scanner(System.in);
		AccountService a=new AccountServiceImpl();
		int choice=0;
		
		do {
			System.out.println("1. Add new account \n 2.delete by id \n3. withdraw \n 4.deposit \n"
					+ " 5. check balance \n 6.display all \n choice:  ");
			 choice=sc.nextInt();
            
			switch(choice)
			{
			case 1: a.AddNewAccount();
				break;
			case 2:a.DeleteById();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:a.CheckBalance();
				break;
			case 6:a.DisplayAll();
				break;
				
			}
			
		}while(choice!=7);
	   
	}

}
