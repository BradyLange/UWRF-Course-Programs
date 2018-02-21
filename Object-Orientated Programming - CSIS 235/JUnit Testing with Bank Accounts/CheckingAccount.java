
public class CheckingAccount extends BankAccount{
	
	private double minimumBalance;
	
	public CheckingAccount(int acctNum, double balc, double minBalc)
	{
			super (acctNum, balc);
			minimumBalance = minBalc;
	}
	
	public boolean withdraw(double amount)
	{
		if (getBalance() < minimumBalance)
			return false;
		else
			return super.withdraw(amount);

	}
	
	//Getter
	public double getMinimumBalance()
	{
		return minimumBalance;
	}
	
	public String createMonthlyStatement()
	{
		String statement = "Account number: " + getAccountNumber()
				+ " Account balance: " + getBalance()
				+ " Minimum balance: " + minimumBalance;
		return statement;

	}


}
