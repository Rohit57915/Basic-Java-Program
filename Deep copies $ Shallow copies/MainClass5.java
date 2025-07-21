class Account 
{
	long accountNumber;
	double accountBalance;
	void withdraw(double amt)
	{
		System.out.println("Withdraw from "+ accountNumber);
		accountBalance=accountBalance-amt;
		System.out.println("Available Balance : " +accountBalance);
	}
	void deposit(double amt)
	{
		System.out.println("Deposit to " +accountBalance);
		accountBalance=accountBalance+amt;
		System.out.println("Available Balance : "+accountBalance);
	}
}
public class MainClass5
{
	public static void main(String[] args)
	{
		Account a1=new Account();
		a1.accountNumber=45448515484548L;
		a1.accountBalance=10000.0;
		a1.withdraw(1000.0);
		a1.deposit(500.0);
	}
}