package com.demo.dao;

import java.util.Set;

import com.demo.beans.Account;

public interface AccountDao {

	boolean OpenNewAccount(Account ac);

	Set<Account> DisplayAll();

	Account findName(String name, int pin);

	Account finddname(String duname);


}
