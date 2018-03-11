package problem_2;

import java.util.Scanner;

/*
 * Brady Lange
 * 3/11/18
 * Program 4
 * This program tests the class NumbersWithPowers to make sure the calculation wit recursion is accurate 
 */

public class NumbersWithPowersApp {

	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		
		//Instantiating the class NumbersWithPowers
		NumbersWithPowers number = new NumbersWithPowers();
		
		//Calling the method that will calculate a number with a power
		System.out.print("Please enter the base number: ");
		int bInput = console.nextInt();
		System.out.print("Please enter the power: ");
		int pInput = console.nextInt();
		System.out.print("Result: " + number.power(bInput, pInput));
		
		console.close();
	}

}
