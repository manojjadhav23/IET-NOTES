package account;

public class Account {
private int accid;
private String acname;
private int pin;
private double balance;
public Account() {
	super();
}
public Account(int accid, String acname, int pin, double balance) {
	super();
	this.accid = accid;
	this.acname = acname;
	this.pin = pin;
	this.balance = balance;
}
public int getAccid() {
	return accid;
}
public void setAccid(int accid) {
	this.accid = accid;
}
public String getAcname() {
	return acname;
}
public void setAcname(String acname) {
	this.acname = acname;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "Account [accid=" + accid + ", acname=" + acname + ", pin=" + pin + ", balance=" + balance + "]";
}
public boolean withdraw(double amt)
{
	if(balance-amt>=1000)
	{
		this.balance = this.balance- amt;
		return true;
	}
	else
	{
		return false;
	}
}
public void deposit(double amt) {
	
	this.balance = this.balance+amt;
}
}
