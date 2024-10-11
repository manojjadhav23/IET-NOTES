package com.demo.beans;

public class Account {
	
	private int acid;
	private String acname;
	private double balance;
	private int pin;
	public Account() {
		super();
	}
	public Account(int acid, String acname, double balance, int pin) {
		super();
		this.acid = acid;
		this.acname = acname;
		this.balance = balance;
		this.pin = pin;
	}
	public int getAcid() {
		return acid;
	}
	public void setAcid(int acid) {
		this.acid = acid;
	}
	public String getAcname() {
		return acname;
	}
	public void setAcname(String acname) {
		this.acname = acname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Account [acid=" + acid + ", acname=" + acname + ", balance=" + balance + ", pin=" + pin + "]";
	}
	
	

}
