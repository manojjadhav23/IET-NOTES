package account;

public interface AccountService {

	void addNewAccount();

	Account[] findAll();

	int WithdrawAmount(int accid, int pin,double amt);

	int deleteById(int accid, int pin);

	int depositAmount(int accid, int pin, double amt);

	double findBalance(int accid, int pin);
}
