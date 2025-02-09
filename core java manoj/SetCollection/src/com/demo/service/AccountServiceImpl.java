package com.demo.service;

import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Account;
import com.demo.beans.CurrentAccount;
import com.demo.beans.SavingAccount;
import com.demo.dao.AccountDao;
import com.demo.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService {
	private AccountDao dao;
	public AccountServiceImpl(){
		dao=new AccountDaoImpl();
	}
	@Override
	public boolean OpenNewAccount(int ch) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String nm=sc.next();
		System.out.println("Enter 4 digit pin");
		int pin=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter secrete question");
		String question=sc.nextLine();
		System.out.println("Enter answer");
		String ans=sc.next();
		System.out.println("Enter amount to be deposited");
		double amt=sc.nextDouble();
		if(ch==1) {
			System.out.println("Enter chequebook number");
			int cnum=sc.nextInt();
			Account ac=new SavingAccount(nm,pin,question,ans,amt, cnum);
			return dao.OpenNewAccount(ac);
		}else if(ch==2) {
			System.out.println("Enter number of transactions");
			int tnum=sc.nextInt();
			Account ac=new CurrentAccount(nm,pin,question,ans,amt,tnum);
			return dao.OpenNewAccount(ac);
		}
		return false;
	}
	@Override
	public Set<Account> DisplayAll() {
		return dao.DisplayAll();
	}
	@Override
	public int WithdrawAmount(String name, int pin,double amt) {
		Account ac = dao.findName(name,pin);
		if(ac!=null) {
			return ac.withdraw(amt);
		}else {
			return 3;
		}
		
	}
	@Override
	public double DepositAmount(String name, int pin, Double amt) {
		Account ac = dao.findName(name,pin);
		if(ac!=null) {
			return ac.deposit(amt);
		}else {
			return 0;
		}
	}
	@Override
	public boolean transferfund(String uname, String duname, int pin, Double amt) {
		Account ac=dao.findName(uname, pin);
		Account dac=dao.finddname(duname);
		if(ac!=null && dac!=null)
		{
			int ans=ac.withdraw(amt);
			if(ans==1) {
				dac.deposit(amt);
			}else {
				return false;
			}
		}
		return false;
	}
}
