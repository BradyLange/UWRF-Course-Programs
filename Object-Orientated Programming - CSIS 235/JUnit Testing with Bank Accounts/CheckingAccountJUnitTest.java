import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheckingAccountTest {
	
	//Instance variables
	private CheckingAccount cAccount;
	
	//Before 
	@Before
	public void setUp() throws Exception {
		//Add values to the object we are testing
		cAccount = new CheckingAccount(11020, 1000, 50);
	}
	
	//Tear down
	@After
	public void tearDown() throws Exception {
		//Set the object to null after tear down
		cAccount = null;
	}

	//Test the constructor
	@Test
	public void testCreate() {
		assertEquals(11020, cAccount.getAccountNumber()); //checks the account number to see if its correct
		assertEquals(1000, cAccount.getBalance(), Math.pow(10, -9)); //checks the balance to see if its correct
		assertEquals(50, cAccount.getMinimumBalance(), Math.pow(10, -9)); //checks the minimum balance to see if its correct
	}
	
	//Test the withdraw method
	@Test
	public void testWithdraw() {
		//Verify the withdraw method denies withdrawing when there's not enough balance
		CheckingAccount account2 = new CheckingAccount(10045, 20, 50);
		//Will be false
		assertFalse(account2.withdraw(15));
		
		//Verify the withdraw method is working properly in calculations
		assertTrue(cAccount.withdraw(100));
		//After the withdraw method is used, -100 should be subtracted from the balance
		assertEquals(900, cAccount.getBalance(), Math.pow(10, -9));
	}
	
	//Test the createMonthlyStatement method
	@Test
	public void testCreateMonthlyStatement() {
		//Not necessary, but checks that the method is not null without any data
		assertNotNull(cAccount.createMonthlyStatement());
		String expected = "Account number: " + cAccount.getAccountNumber()
						+ " Account balance: " + cAccount.getBalance()
						+ " Minimum balance: " + cAccount.getMinimumBalance();
		//Compare both of the Strings to see if they're equal/accurate
		assertEquals(expected, cAccount.createMonthlyStatement());
	}
	
} //end of class CheckingAccountTest

