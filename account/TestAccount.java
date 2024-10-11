package account;
import java.util.Scanner;
public class TestAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountService ac = new AccountServiceImpl();
        int choice = 0;
        do { 
        System.out.println("1. Add new Account\n2. Delete By Id\n3. Withdrawl\n4. Deposit\n5. Check Balance\n6. Display All\n7. Exit");
        System.out.println("Enter Choice:"); 
        switch(choice)
        {
        case 1: 
        	ac.addNewAccount();
        	break; 
        case 2: 
        	System.out.println("Enter the accid:");
        	int accid = sc.nextInt();
        	System.out.println("Enter the pin:");
        	int pin = sc.nextInt(); 
        	int status = ac.deleteById(accid,pin);
        	if(status>0)
        	{
        		System.out.println("Account Closed");
        	} 
        	else
        	{
        		System.out.println("Pin is wrong.");
        	}
        	break;
        case 3: 
        	System.out.println("Enter the accid:");
        	accid = sc.nextInt();
        	System.out.println("Enter Account number:");
        	pin = sc.nextInt();  
        	System.out.println("Enter the amt to withdraw:");
        	double amt = sc.nextInt();
        	 status = ac.WithdrawAmount(accid,pin,amt); 
        	if(status>0) 
        	{
        		System.out.println("Money Withdrawal Successful");
        	} 
        	else if(status==-3)
        	{
        		System.out.println("Insufficient Balance");
        	} 
        	else
        	{
        		System.out.println("Pin is wrong.");
        	}
        	break;
        case 4:
        	System.out.println("Enter accid:");
        	accid = sc.nextInt();
        	System.out.println("Enter pin:");
        	pin = sc.nextInt();
        	System.out.println("Enter the amount to be deposited.");
        	amt = sc.nextInt();
        	status = ac.depositAmount(accid,pin,amt);
        	if(status>0)
        	{
        		System.out.println("Money Deposited Successfuly");
        	} 
        	else
        	{
        		System.out.println("Pin is wrong.");
        	}
        	break;
         case 5: 
        	 System.out.println("Enter accid:");
        	 accid = sc.nextInt();
        	 System.out.println("Enter pin:");
        	 pin = sc.nextInt();
        	 double bal = ac.findBalance(accid, pin);
        	 if(bal>0)
        	 {
        		 System.out.println("Balance of account is:"+accid+":"+bal);
        	 } 
        	 else
        	 {
        		 System.out.println("Pin is wrong");
        	 }
        	break;
        case 6: 
        	Account[] sacc = ac.findAll(); 
        	for(Account a: sacc)
        	{
        		if(a!=null)
        		{
        			System.out.println(a);
        		} 
        		else
        		{
        			break;
        		}
        	}
        	break;
        case 7: 
        	System.out.println("Thank you for visiting.");
        	sc.close();
        	break;
        default: 
        	System.out.println("Wrong Choice.");
        	break;
           } 
        }while(choice!=7);
	}

}
