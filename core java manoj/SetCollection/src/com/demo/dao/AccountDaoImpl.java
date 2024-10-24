package com.demo.dao;

import java.util.HashSet;
import java.util.Set;

import com.demo.beans.Account;
import com.demo.beans.CurrentAccount;
import com.demo.beans.SavingAccount;

public class AccountDaoImpl implements AccountDao {
	static Set<Account> accset;
	static {
		accset=new HashSet<>();
		accset.add(new SavingAccount("HARSH",1234,"Age?","22",10000,123456));
		accset.add(new SavingAccount("Manoj",4567,"Age?","22",20000,456789));
		accset.add(new CurrentAccount("JADHAV",7896,"Age?","25",50000,10));
		Account.setCnt(4);
	}

	@Override
	public boolean OpenNewAccount(Account ac) {
		accset.add(ac);
		return true;
	}

	@Override
	public Set<Account> DisplayAll() {
		return accset;
	}

	@Override
	public Account findName(String name, int pin) {
		for(Account ac :accset) {
			if(ac.getAname().equals(name) && ac.getPin()==pin) {
				return ac;
			}
		}
		return null;
	}

	@Override
	public Account finddname(String duname) {
		// TODO Auto-generated method stub
		return null;
	}


}
