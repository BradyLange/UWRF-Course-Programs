
abstract public class BankAccount {

	private int accountNumber;
	private double balance;
	
	public BankAccount(int number, double bal)
	{
		accountNumber = number;
		balance = bal;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public boolean withdraw(double amount)
	{
		if(balance - amount < 0)
			return false;
		else
		{
			balance = balance - amount;
			return true;
		}
			
	}
	
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
}
