package problem_2;

import java.util.Scanner;

/*
 * Brady Lange
 * 3/11/18
 * Program 4
 * This program uses the method power to calculate a base number and its power using recursion
 */

public class NumbersWithPowers {
	
	Scanner console = new Scanner(System.in);
  
	//Method that uses recursion to take an input of a base and its power and calculates it
	public double power(int base, int power)
	{
		//If the power is negative the recursion algorithm is altered to division
		if(power < 0)
			return power(base, power + 1) / base;
			
		//If the power equals 0 it simply just returns 1 (base case)
		else if(power == 0)
			return 1;
		
		//If the power is positive it will return the recursion algorithm with multiplication
		else
			return power(base, power - 1) * base;
	} 

} //End of class
