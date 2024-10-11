package account;
import java.util.Scanner;
public class AccountServiceImpl implements AccountService{
    static Account [] sacc;
    static int cnt;
    static
    {
    	sacc = new Account[100]; 
    	cnt = 0; 
    	sacc[0] = new Account(1234,"Jayprakash",123,34644);
    	sacc[1] = new Account(1235,"Nikhil",124,34678);
    	cnt = 2;
    }
	@Override
	public void addNewAccount() {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter Acc. id:");
     int accid = sc.nextInt();
	 System.out.println("Enter Accountholder name");
	 String anm= sc.next();
	 System.out.println("Enter Account Balence");
	 double accbal = sc.nextDouble();
	 System.out.println("Enter Pin");
	 int pw = sc.nextInt();
	 sacc[cnt]=new Account(accid,anm,pw,accbal);
	 cnt++ ;
	} 
	@Override
	public Account[] findAll() {
		return sacc;
		
	}
	private int findAccountById(int accid, int pin)
	{
		for(int i = 0 ; i<sacc.length ; i++)
		{
			if(sacc[i].getAccid()==accid)
			{
				if(sacc[i].getPin()==pin)
				{
					return i;
				}
				else
				{
					return -2;
				}
			}
		} 
		return -1;
	}
	@Override
	public int WithdrawAmount(int accid, int pin,double amt) {
		int pos = findAccountById(accid,pin);
		if(pos>0)
		{
			boolean status = sacc[pos].withdraw(amt);
			if(status)
			{
				return 1;
			} 
			else
			{
				return -3;
			}
		} 
		return pos;
		
	}
	@Override
	public int deleteById(int accid, int pin) {
		int pos = findAccountById(accid,pin);
		if(pos>=0)
		{
			for(int i = pos ; i<cnt ; i++)
			{
				sacc[i] = sacc[i+1];
			}
		}
		return pos;
	}
	@Override
	public int depositAmount(int accid, int pin, double amt) {
		int pos = findAccountById(accid,pin);
		if(pos>=0)
		{
			sacc[pos].deposit(amt);
		}
		return pos;
	}
	@Override
	public double findBalance(int accid, int pin) {
		int pos = findAccountById(accid,pin);
		if(pos>=0)
		{
			return sacc[pos].getBalance();
		}
		return pos;
	}
	

}
